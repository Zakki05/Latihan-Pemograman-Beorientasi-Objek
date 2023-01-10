/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8;

/**
 *
 * @author LENOVO
 */
public class Latihan2 {
    public static void main(String[] args) {
        /*
        int sum = 0;
        int difference = 0;  
        int product = 0;
        int quotient = 0;
        
        sum = Integer.parseInt(args[2]) + Integer.parseInt(args[3]);
        difference = Integer.parseInt(args[2]) - Integer.parseInt(args[3]);
        product = Integer.parseInt(args[2]) * Integer.parseInt(args[3]);
        quotient = Integer.parseInt(args[2]) / Integer.parseInt(args[3]);
       
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
        System.out.println("Quotient = "+quotient);
        */
        
        double a = Double.parseDouble(args[2]);
        double b = Double.parseDouble(args[3]);
        
        double sum, difference, product, quotient;
        
        sum = a+b;
        difference = a-b;
        product = a*b;
        quotient = a/b;
        
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
        System.out.println("Quotient = "+quotient);
        
    }
}
