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
public class MyInteger implements Relation {
    
    public boolean isGreater( Object a, Object b){
        int angka1 = (int)a;
        int angka2 = (int)b;
        return angka1>angka2;
    }
    
    public boolean isLess( Object a, Object b){
        int angka1 = (int)a;
        int angka2 = (int)b;
        return angka1<angka2;
    }
    
    public boolean isEqual( Object a, Object b){
        int angka1 = (int)a;
        int angka2 = (int)b;
        return angka1==angka2;
    }
}
