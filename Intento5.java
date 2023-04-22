/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento5;

import java.util.Scanner;

/**
 *
 * @author romer
 */
public class Intento5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado 
        y muestre por pantalla el doble, 
        el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero");
        double numEntero = leer.nextDouble();
        double raiz= Math.sqrt(numEntero);
        double doble= numEntero*2;
        double triple= numEntero*3;
        System.out.println( "la raiz es: "+ raiz);
       System.out.println( "el doble es: "+ doble);
       System.out.println( "el triple es: "+ triple);
       System.out.println(" ");
       System.out.println("<3 SOMOS UNOS CAPOS <3");
        // TODO code application logic here
    }
    
}
