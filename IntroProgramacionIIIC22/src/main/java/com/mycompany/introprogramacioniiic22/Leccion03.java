package com.mycompany.introprogramacioniiic22;

import javax.swing.JOptionPane;

public class Leccion03 {

    public static void clase03() {
        /**
         * *********************ejercicio******************************************
         */
        //
        for (int i = 0; i < 5; i++) {
            System.out.println("@@@@@@@@@@");
        }

        // Ejercicio 1
        System.out.println("ejemplo2");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }

        //Ejercicio 2
        int numero;
        String numeroLectura = JOptionPane.showInputDialog("Ingrese el numero a multiplicar");
        numero = Integer.parseInt(numeroLectura);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(resultado);
        }

        //Ejercicio 3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Ejercicio 5
        int cantidadEstudiantes;
        String cantidadEstudiantesLec = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes");
        cantidadEstudiantes = Integer.parseInt(cantidadEstudiantesLec);
        int mayor = 0;
        int menor = 0;
        int promedio = 0;
        int cantidadAprobados = 0;

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            String notaLectura = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i);
            int nota = Integer.parseInt(notaLectura);
            promedio = promedio + nota;

            if (i == 1) {
                menor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
            if (nota > mayor) {
                mayor = nota;
            }

            if (nota > 70) {
                cantidadAprobados = cantidadAprobados + 1;
            }

        }
        promedio = promedio / cantidadEstudiantes;
        System.out.println("La nota Mayor es: " + mayor);
        System.out.println("La nota Menor es: " + menor);
        System.out.println("El promedio es: " + promedio);
        System.out.println("La cantidad de aprobados es: " + cantidadAprobados);

        //Ejercicio 6
        int mayor2 = 0;
        int menor2 = 0;
        int promedio2 = 0;
        int cantidadAprobados2 = 0;
        int i = 1;
        int contadorEstudiantes = 1;

        while (i >= 1) {
            String notaLectura2 = JOptionPane.showInputDialog("Ingrese la nota del estudiante " + contadorEstudiantes);
            int nota2 = Integer.parseInt(notaLectura2);
            promedio2 = promedio2 + nota2;
            if (i == 1) {
                menor2 = nota2;
            } else if (nota2 < menor2) {
                menor2 = nota2;
            }
            if (nota2 > mayor2) {
                mayor2 = nota2;
            }

            if (nota2 > 70) {
                cantidadAprobados = cantidadAprobados + 1;
            }
            contadorEstudiantes = contadorEstudiantes + 1;
            i = nota2;
        }
        promedio2 = promedio2 / contadorEstudiantes;

        System.out.println("La nota Mayor es: " + mayor2);
        System.out.println("La nota Menor es: " + menor2);
        System.out.println("El promedio es: " + promedio2);
        System.out.println("La cantidad de aprobados es: " + cantidadAprobados2);
    }

}
