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
public class Circle extends Shape{
    protected String nama;
    protected double jari;
    protected double luas;
     
    public void setName (String nama){
        this.nama = nama;
    }
    
    public String getName(){
        return nama;
    }
    
    public void setJari (double jari){
        this.jari = jari;
    }
    
    public double getJari(){
        return jari;
    }
    
    public void setArea (double luas){
        this.luas = luas;
    } 
    
    public double getArea(){
        luas = 3.14 * jari * jari;
        return luas;
    }
    
    public void print(String nama,double jari,double luas){
        System.out.println("Nama Bentuk : "+nama);
        System.out.println("Sisi : "+jari);
        System.out.println("Luas : "+luas);
    }

}
