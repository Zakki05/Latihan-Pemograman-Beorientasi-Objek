/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Latihan2a {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        int angka = 0;
        
        System.out.println("==Program Membaca Bilangan==\n");
        
        try {
            System.out.print("Masukkan Angka : ");
            angka = Integer.parseInt(dataIn.readLine());
        }
        catch (IOException e) {
            System.out.println("Error !");
        }
        
        if (angka >0 && angka <=10){
            System.out.println("Angka yang anda masukkan adalah "+angka+" !");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
