/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki071222;

/**
 *
 * @author LENOVO
 */

public class Square extends Shape{
    protected String nama;
    protected double sisi;
    protected double luas;
     
    public void setName (String nama){
        this.nama = nama;
    }
    
    public String getName(){
        return nama;
    }
    
    public void setSisi (double sisi){
        this.sisi = sisi;
    }
    
    public double getSisi(){
        return sisi;
    }
    
    public void setArea (double luas){
        this.luas = luas;
    } 
    
    public double getArea(){
        luas = sisi * sisi;
        return luas;
    }
    
    public void print(String nama,double sisi,double luas){
        System.out.println("Nama Bentuk : "+nama);
        System.out.println("Sisi : "+sisi);
        System.out.println("Luas : "+luas);
    }

}

