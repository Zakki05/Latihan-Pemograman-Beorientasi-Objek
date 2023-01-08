/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki.model;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String nobp;
    private String nama;
    private String alamat;
    private String jenkel;
    
    public String getNobp(){
        return nobp;
    }
    
    public void setNobp (String nobp){
        this.nobp = nobp;
    }
    
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
    
    public String getJenkel(){
        return jenkel;
    }
    
    public void setJenkel (String jenkel){
        this.jenkel = jenkel;
    }   
    
}
