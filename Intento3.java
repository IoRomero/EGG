/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento3;

import java.util.Scanner;

/**
 *
 * @author romer
 */
public class Intento3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una frase");
         String cadena = leer.nextLine();
         System.out.println (cadena.toUpperCase());
         System.out.println (cadena.toLowerCase());
        // TODO code application logic here
    }
    
}
