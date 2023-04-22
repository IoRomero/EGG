/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentonro1;

import java.util.Scanner;

/**
 *
 * @author romer
 */
public class Intentonro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese numero 1");
        int numEntero = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int numEntero2 = leer.nextInt(); 
        int suma=numEntero+ numEntero2;
        System.out.println( "la suma de los numeros es: "+ suma);
       
        // TODO code application logic here
    }
    
    
}
