/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki191022;

/**
 *
 * @author LENOVO
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        int grade = 0;
        
        try {
            System.out.print("Masukkan Nilai Anda : ");
            grade = Integer.parseInt(dataIn.readLine());
        }
        catch (IOException e) {
            System.out.println("Error !");
        }
        
        switch(grade){
            case 100:
                System.out.println("Excellent!");
                break;
            case 90 :
                System.out.println("Good Job!");
                break;
            case 80 :
                System.out.println("Study Harder!");
                break;
            default :
                System.out.println("Sorry, you failed");
        }
    }
}
