/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_AhmadFarisAlmuzakki_161122;

/**
 *
 * @author LENOVO
 */
public class GajiRecord {
    private String kodeSlip;
    private String tanggal;
    private String namaPegawai;
    private int golongan;
    private double gajiPokok;
    private double tunjanganAnak;
    private double tunjanganIstri;
    private double totalGaji;
    
    public String getKodeSlip(){
        return kodeSlip;
    }
    
    public void setKodeSlip (String kodeSlip){
        this.kodeSlip = kodeSlip;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal (String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getNamaPegawai(){
        return namaPegawai;
    }
    
    public void setNamaPegawai (String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    public int getGolongan(){
        return golongan;
    }
    
    public void setGolongan (int golongan){
        this.golongan = golongan;
    }
    
    public double getGajiPokok(){
        if (golongan == 1){
            gajiPokok = 1000000;
        }
        else if (golongan == 2){
            gajiPokok = 2000000;
        }
        return gajiPokok;
    }
    
    public double getTunjanganAnak(){
        return tunjanganAnak;
    }
    
    public void setTunjanganAnak (double tunjanganAnak){
        this.tunjanganAnak = tunjanganAnak;
    }
    
    public double getTunjanganIstri(){
        return tunjanganIstri;
    }
    
    public void setTunjanganIstri (double tunjanganIstri){
        this.tunjanganIstri = tunjanganIstri;
    }
    
    public double getTotalGaji(){
        totalGaji = (gajiPokok + tunjanganAnak + tunjanganIstri);
        return totalGaji;
    }
    
}
