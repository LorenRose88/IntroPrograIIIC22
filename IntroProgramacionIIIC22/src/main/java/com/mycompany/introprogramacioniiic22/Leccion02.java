/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introprogramacioniiic22;

import javax.swing.JOptionPane;

/**
 *
 * @author intel2020
 */
public class Leccion02 {
    
    public static void clase02(){
    
                    System.out.println("Hello World!");

        int numero1 = 12;
        int numero2 = 3;
        int resultado = 1;
        int edad;
        String edadLectura;
        int nota;
        String notaLectura;
        //variables practica 3 
        int numero01;
        int numero02;
        int numero03;
        int numero04;
        String numero01Lectura;
        String numero02Lectura;
        String numero03Lectura;
        String numero04Lectura;

        if (numero1 == numero2) {
            resultado = numero1 + numero2;
            System.out.println(resultado);
        }

        if (numero1 != numero2) {//condicion verdadera, sí entra
            resultado = numero1 + numero2;
            System.out.println(resultado);
        }

        if (resultado == 1 && numero1 < numero2) {//No entra ya que la condicion es Falsa

        }

        if (resultado == 15 && numero1 > numero2) {

            System.out.println("Sí entró");
        }

        /**
         * ********Practica********
         */
        //Ejercicio 1
        edadLectura = JOptionPane.showInputDialog("Ingrese su Edad");
        edad = Integer.parseInt(edadLectura);

        if (edad >= 18) {
            System.out.println("Si puede votar");

            if (edad >= 31) {
                System.out.println("Si puede ser candidato");
            }
        } else {
            System.out.println("No puede votar");
        }

        if (edad < 18) {
            System.out.println("No puede votar");
        }
        // Ejercicio 2
        notaLectura = JOptionPane.showInputDialog("Ingrese su Nota");
        nota = Integer.parseInt(notaLectura);

        if (nota >= 70) {
            System.out.println("Aprobado");
        }

        if (nota < 70) {
            System.out.println("No aprobó");

        }

        // ejecicio 3
        numero01Lectura = JOptionPane.showInputDialog("Ingrese Numero 1");
        numero02Lectura = JOptionPane.showInputDialog("Ingrese Numero 2");
        numero03Lectura = JOptionPane.showInputDialog("Ingrese Numero 3");
        numero04Lectura = JOptionPane.showInputDialog("Ingrese Numero 4");

        numero01 = Integer.parseInt(numero01Lectura);
        numero02 = Integer.parseInt(numero02Lectura);
        numero03 = Integer.parseInt(numero03Lectura);
        numero04 = Integer.parseInt(numero04Lectura);

        if (numero01 > numero02) {
            if (numero01 > numero03) {
                if (numero01 > numero04) {
                    System.out.println("El numero mayor es: " + numero01);
                } else {
                    System.out.println("El numero mayor es: " + numero04);
                }
            }else {
                    System.out.println("El numero mayor es: " + numero04);
                }
        } else if (numero02 > numero03) {
            if (numero02 > numero04) {
                System.out.println("El numero mayor es: " + numero02);
            }
        } else if (numero03 > numero04) {
            System.out.println("El numero mayor es: " + numero03);

        } else {
            System.out.println("El numero mayor es: " + numero04);
        }
    }
}
