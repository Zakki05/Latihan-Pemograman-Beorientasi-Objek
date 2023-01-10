/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Latihan2 {
    public static void main(String[] args){
        BufferedReader angkaIn=new BufferedReader(new InputStreamReader(System.in));
        
        int i=0;
        int max=0;
        int angka[];
        
        angka= new int[10];
        
        try{
            for(i=0;i<angka.length;i++){
                System.out.print("Masukkan Angka : ");
                angka[i]=Integer.parseInt(angkaIn.readLine());
            }
        }
        catch(IOException e){
            System.out.println("Error!");
        }
        
        for(i=0;i<angka.length;i++){
            System.out.print(angka[i] +" ");
        }
        
        max=angka[0];
        for(i=0;i<angka.length;i++){
            if(max<angka[i]){
                max=angka[i];
            }
        }
        
        System.out.println("\nAngka Max : " +max);
    } 
}
