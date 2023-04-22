/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento4;

import java.util.Scanner;

/**
 *
 * @author romer
 */
public class Intento4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados 
        se debe mostrar su equivalente en grados Fahrenheit. 
        La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
         Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese grados celcius");
        double numEntero = leer.nextDouble();
        double Equivalencia= 32 + (9 * numEntero/5);
        System.out.println( " la equivalencia es: " + Equivalencia);
        // TODO code application logic here
    }
    
}
