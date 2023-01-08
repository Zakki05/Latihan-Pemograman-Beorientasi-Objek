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
public class StudentRecord1 {
    public static void main(String[] args) {
        StudentRecord student3 = new StudentRecord("Doni","Padang",20);
        student3.setAge(20);
        student3.print("");
        System.out.println("Jumlah SIswa : "+student3.getStudentCount());
        
        StudentRecord student4 = new StudentRecord("Fajar","Lumin",20);
        student4.print("");
        System.out.println("Jumlah SIswa : "+StudentRecord.getStudentCount());
        
        
    }
}
