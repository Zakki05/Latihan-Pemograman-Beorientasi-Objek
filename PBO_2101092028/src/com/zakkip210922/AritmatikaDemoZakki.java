/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakkip210922;

/**
 *
 * @author LENOVO
 */
public class AritmatikaDemoZakki {
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        
        System.out.println("Variabel values...");
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        
        //Penjumlahan
        System.out.println("\nAdding");
        System.out.println("i + j = " + (i+j) );
        System.out.println("x + y = " + (x+y) );
        
        //Pengurangan 
        System.out.println("\nSubtracting");
        System.out.println("i - j = " + (i-j) );
        System.out.println("x - y = " + (x-y) );
        
        //Perkalian
        System.out.println("\nMultiplying");
        System.out.println("i * j = " + (i*j) );
        System.out.println("x * y = " + (x*y) );
        
        //Pembagian
        System.out.println("\nDividing");
        System.out.println("i / j = " + (i/j) );
        System.out.println("x / y = " + (x/y) );
        
        //modulus 
        System.out.println("\nComputing the remainder"); 
        System.out.println("i % j = " + (i%j)); 
        System.out.println("x % y = " + (x%y)); 
         
        //tipe penggabungan 
        System.out.println("\nMixing tipes");
        System.out.println("j + y = " + (j+y)); 
        System.out.println("i * x = " + (i*x));
    }
}
