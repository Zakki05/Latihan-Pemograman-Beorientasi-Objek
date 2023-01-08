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
public class RelasiDemoZakki {
    public static void main(String[] args) {
        //a few numbers
        int i = 37;
        int j = 42;
        int k = 42;
        
        System.out.println("Variable values...");
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
        System.out.println("k = "+ k);
        
        //lebih besar dari
        System.out.println("greater than");
        System.out.println("i > j = "+ (i > j)); //false
        System.out.println("j > i = "+ (j > i)); //true
        System.out.println("k > j = "+ (k > j)); //false
        
        //besar sama dengan
        System.out.println("greater than or equal to");
        System.out.println("i >= j = "+ (i >= j)); //false
        System.out.println("j >= i = "+ (j >= i)); //true
        System.out.println("k >= j = "+ (k >= j)); //true
        
        //lebih kecil dari
        System.out.println("less than");
        System.out.println("i < j = "+ (i < j)); //true
        System.out.println("j < i = "+ (j < i)); //false
        System.out.println("k < j = "+ (k < j)); //false
        
        //kecil sama dengan
        System.out.println("less than or equal to");
        System.out.println("i <= j = "+ (i <= j)); //true
        System.out.println("j <= i = "+ (j <= i)); //false
        System.out.println("k <= j = "+ (k <= j)); //true
        
        //sama dengan
        System.out.println("equal to");
        System.out.println("i == j = "+ (i == j)); //false
        System.out.println("k == j = "+ (k == j)); //true
        
        //tidak sama dengan
        System.out.println("not equal to");
        System.out.println("i != j = "+ (i != j)); //true
        System.out.println("k != j = "+ (k != j)); //false
        
        
    }
}
