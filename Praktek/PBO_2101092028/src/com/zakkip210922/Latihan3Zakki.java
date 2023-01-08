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
public class Latihan3Zakki {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int max;
        
        System.out.println("Number 1 = "+ number1);
        System.out.println("Number 2 = "+ number2);
        System.out.println("Number 3 = "+ number3);
        
        max = (number2 >= number1)? number2: number1;
	max = (number3 >= max)? number3: max;
	System.out.println("Nilai tertingginya adalah angka = "+max);
    }
}
