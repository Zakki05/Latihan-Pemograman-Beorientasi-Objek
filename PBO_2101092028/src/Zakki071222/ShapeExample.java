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
import java.util.Scanner;

public class ShapeExample {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Square square1=new Square();
        Scanner in=new Scanner(System.in);
        
        /*int r,s;
        String shape;
        
        System.out.print("Masukkan Nama Shape : ");
        shape=in.nextLine();
        
        System.out.print("Masukkan Jari-Jari : ");
        r=in.nextInt();
        
        circle1.setName(shape);
        circle1.setJari(r);
        
        circle1.getName();
        circle1.getArea();
        System.out.println();
        
        in.nextLine();
        System.out.print("Masukkan Nama Shape : ");
        shape=in.nextLine();
        
        System.out.print("Masukkan Sisi : ");
        s=in.nextInt();
        
        square1.setName(shape);
        square1.setSisi(s);
        
        square1.getName();
        square1.getArea();
        System.out.println();
        */
        
        circle1.setName("Lingkaran");
        circle1.setJari(7.0);
        
        circle1.getName();
        circle1.getArea();
        
        
        circle1.print(circle1.getName(), 7.0, circle1.getArea());
        System.out.println();
        
        square1.setName("Persegi");
        square1.setSisi(5.0);
        
        square1.getName();
        square1.getArea();
        
        square1.print(square1.getName(), 5.0, square1.getArea());
    }
}
