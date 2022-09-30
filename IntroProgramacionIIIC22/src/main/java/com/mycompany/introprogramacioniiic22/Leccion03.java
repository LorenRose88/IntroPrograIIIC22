package com.mycompany.introprogramacioniiic22;

import javax.swing.JOptionPane;

public class Leccion03 {

    public static void clase03() {

        //ciclo for con incremento
        for (int i = 1; i <= 5; i++) {
            System.out.println("El valor de i es: " + i);
        }

        //Ciclo For decremento
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Feliz Año nuevo");
        System.out.println("");

        //Ciclo While
        int i = 1;
        int suma = 0;
        while (i <= 10) {
            //suma +=i;
            suma = suma + i;
            System.out.println(i);
            ++i;
        }
        System.out.println("La sumatoria es: " + suma);

        /**
         * ******** Ejercicio**************
         */
        for (int j = 0; j < 5; j++) {
            System.out.println("@@@@@@@@@@");
        }

        //Ciclo do while
        int j = 0;

        do {
            System.out.println("El valor de j es: " + j);
            ++j;
        } while (j < 5);

        /**
         * *******************Ejercicios********************
         */
        System.out.println("ejercicio");

        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 10; l++) {
                System.out.print("@");
            }
            System.out.println("");
        }

        //Ejercicio2
        int numero;
        String numeroLectura = JOptionPane.showInputDialog("Ingrese el numero a multiplicar");
        numero = Integer.parseInt(numeroLectura);
        for (int m = 1; m <= 10; m++) {
            int resultado = numero * m;
            System.out.println("El resultado es " + resultado);
        }

        //Ejercicio 3
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l <= k; l++) {
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
        int cantidadAprobados =0;

        for (int k = 1; k <= cantidadEstudiantes; k++) {
            String notaLectura = JOptionPane.showInputDialog("Ingrese la nota");
            int nota = Integer.parseInt(notaLectura);
            
            promedio = promedio+nota;
            
            if (k == 1) {
                menor = nota;
            } else if (nota < menor) {
                menor = nota;
            }

            if (nota > mayor) {
                mayor = nota;
            }
            
            if (nota>70){
            cantidadAprobados =cantidadAprobados+1;
            }

        }
        
        System.out.println("La nota Mayor es: " + mayor);
        System.out.println("La nota Menor es: " + menor);
        System.out.println("El promedio de las notas fue: "+promedio/cantidadEstudiantes);
        System.out.println("La cantidad de aprobados fue: " + cantidadAprobados);

        
        //Ejercicio 6
        
        int mayor2 = 0;
        int menor2 = 0;
        int promedio2 = 0;
        int cantidadAprobados2 =0;
        int n=1;
        int contadorEsrudientes=1;
        
        while(n>=0){
         String notaLectura2 = JOptionPane.showInputDialog("Ingrese la nota");
            int nota2 = Integer.parseInt(notaLectura2);
        promedio2 = promedio2+nota2;
            
            if (n == 1) {
                menor2 = nota2;
            } else if (nota2 < menor2) {
                menor2 = nota2;
            }

            if (nota2 > mayor2) {
                mayor2 = nota2;
            }
            
            if (nota2>70){
            cantidadAprobados2 =cantidadAprobados2+1;
            }
            
            contadorEsrudientes =contadorEsrudientes+1;
            
            n = nota2;
        }
        
       System.out.println("La nota Mayor es: " + mayor2);
        System.out.println("La nota Menor es: " + menor2);
        System.out.println("El promedio de las notas fue: "+promedio2/contadorEsrudientes);
        System.out.println("La cantidad de aprobados fue: " + cantidadAprobados2);
    }

}
