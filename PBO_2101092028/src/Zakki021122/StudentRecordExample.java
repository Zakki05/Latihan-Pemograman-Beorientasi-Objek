/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki021122;

/**
 *
 * @author LENOVO
 */
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        
        student1.setName("Zakki");
        student1.setAddress("Ulu Gadut");
        student1.setAge(19);
        student1.setMathGrade(95);
        student1.setEnglishGrade(90);
        student1.setScienceGrade(95);
        
        System.out.println("Nama : "+student1.getName());
        System.out.println("Alamat : "+student1.getAddress());
        System.out.println("Umur : "+student1.getAge());
        System.out.println("Nilai Matematika : "+student1.getMathGrade());
        System.out.println("Nilai Bahasa Inggris : "+student1.getEnglishGrade());
        System.out.println("Nilai IPA : "+student1.getScienceGrade());
        System.out.println("Rata-rata : "+student1.getAverage());
        System.out.println("nilai tertinggi : "+student1.getMaximum());
        
        StudentRecord student2 = new StudentRecord();
        
        student2.setName("Rifki");
        student2.setAddress("Pengambiran");
        student2.setAge(21);
        student2.setMathGrade(90);
        student2.setEnglishGrade(85);
        student2.setScienceGrade(95);
        student2.print("");
        student2.print(student2.getEnglishGrade(),
        student2.getMathGrade(),
        student2.getScienceGrade());
    }
}
