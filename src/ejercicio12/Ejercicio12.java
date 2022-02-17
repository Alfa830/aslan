/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author ALFA830
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
        //la nota se pedirá de nuevo hasta que la nota sea correcta. 
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("buenos dias");
        do{
            System.out.println("Ingrese un numero del 0 al 10 ");
            num =leer.nextInt(); 
            
           
        }while (num >= 0 & 10 < num );
        
    }
    
}
