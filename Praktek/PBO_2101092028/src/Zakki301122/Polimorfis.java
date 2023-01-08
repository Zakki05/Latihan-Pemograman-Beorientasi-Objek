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
public class Polimorfis {
    public static void main(String[] args) {
        Person ref;
        Student student = new Student();
        Employee employee = new Employee();
        
        //class student
        ref = student;
        String name = ref.getName();
        System.out.println(name);        
        printInformation(student);

        
        //class employee
        ref = employee;
        String name1 = ref.getName();
        System.out.println(name1);
        printInformation(employee);
        
        
    }
    
    public static void printInformation( Person person ){ 
        if (person instanceof Student){
            System.out.println("Nama Student : "+person.getName());
        }
        else if (person instanceof Employee){
            System.out.println("Nama Employee : "+person.getName());
        }
    }
    
    
}
