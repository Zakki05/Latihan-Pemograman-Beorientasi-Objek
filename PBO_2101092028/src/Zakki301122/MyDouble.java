/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki301122;

/**
 *
 * @author LENOVO
 */
public class MyDouble implements Relation {
    
    public boolean isGreater( Object a, Object b){
        double angka1 = (double)a;
        double angka2 = (double)b;
        return angka1>angka2;
    }
    
    public boolean isLess( Object a, Object b){
        double angka1 = (double)a;
        double angka2 = (double)b;
        return angka1<angka2;
    }
    
    public boolean isEqual( Object a, Object b){
        double angka1 = (double)a;
        double angka2 = (double)b;
        return angka1==angka2;
    }
}
