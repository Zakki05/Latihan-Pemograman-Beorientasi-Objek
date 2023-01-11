/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11.Latihan_1;

/**
 *
 * @author user
 */
public class Komputer extends StudentRecord {
    public void setKomputer(double komputer){
        super.komputer=komputer;
    }
    
    public double getKomputer(){
        System.out.print("Nilai Pengetahuan Komputer Anda : ");
        return komputer;
    }
}
