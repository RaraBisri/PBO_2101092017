/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rara2810;

/**
 *
 * @author USER
 */
public class latihan7 {
    public static void main (String[] args){
        double a = Double.parseDouble (args[2]);
        double b = Double.parseDouble (args[3]);
        
        double Sum,difference,product,quotient;
        
        Sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;
        
            System.out.println("Sum = " + Sum);
            System.out.println("difference = " + difference);
            System.out.println("Product = " + product);
            System.out.println("quotient = " + quotient);
    }
}
