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
public class Peminjaman {
    private String noBp;
    private String kodeBuku;
    private String tanggalPinjam;
    private String tanggalKembali;
    
    public String getNoBp(){
        return noBp;
    }
    
    public void setNoBp (String noBp){
        this.noBp = noBp;
    }
    
    public String getKodeBuku(){
        return kodeBuku;
    }
    
    public void setKodeBuku (String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    
    public String getTanggalPinjam(){
        return tanggalPinjam;
    }
    
    public void setTanggalPinjam (String tanggalPinjam){
        this.tanggalPinjam = tanggalPinjam;
    }   
    
    public String getTanggalKembali(){
        return tanggalKembali;
    }
    
    public void setTanggalKembali (String tanggalKembali){
        this.tanggalKembali = tanggalKembali;
    } 
}
