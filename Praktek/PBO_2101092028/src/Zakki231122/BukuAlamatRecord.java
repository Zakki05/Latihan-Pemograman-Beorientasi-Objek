/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki231122;

/**
 *
 * @author LENOVO
 */
public class BukuAlamatRecord {
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat (String alamat){
        this.alamat = alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public void setTelepon (String telepon){
        this.telepon = telepon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public void print(String nama,String alamat,String telepon,String email){
        System.out.println("Nama : "+nama);
        System.out.println("Almat : "+alamat);
        System.out.println("Nomor Telepon : "+telepon);
        System.out.println("Email : "+email);
    }
}
