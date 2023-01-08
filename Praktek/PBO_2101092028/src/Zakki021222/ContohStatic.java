/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki021222;

/**
 *
 * @author LENOVO
 */
public class ContohStatic {
    public int tambah (int x, int y){
        return (x+y);
    }
    
    public static void main(String[] args) {
        ContohStatic c = new ContohStatic();
        int hasil = c.tambah(5, 2);
        System.out.println(hasil);
    }
}
