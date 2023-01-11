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
public class StudentRecord {
   
    int a;
    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;
    protected double komputer;
    //area penulisan kode selanjutnya

    private static int studentCount;
    
    public StudentRecord(){
    //area inisialisasi kode;
        this("Alif","Padang",19);
        studentCount++;
    }
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord(String name, String address,int age){
        this.name = name;
        this.address = address;
        this.age=age;
        studentCount++;
    }
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }
    
    public int getAge(){
    return age;
    }

    public void setAge(int age){
        this.age=age;
    }
    
    public double getMathGrade(){
    return mathGrade;
    }

    public void setMathGrade(double mathGrade){
        this.mathGrade=mathGrade;
    }
    
    public double getEnglishGrade(){
    return englishGrade;
    }

    public void setEnglishGrade(double englishGrade){
        this.englishGrade=englishGrade;
    }
    
    public double getScienceGrade(){
    return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade){
        this.scienceGrade=scienceGrade;
    }
    
    public void setKomputer(double komputer){
        this.komputer=komputer;
    }
    
    public double getKomputer(){
        return komputer;
    }
    
    public double getAverage(){
        double ave;
        
        ave=((mathGrade+englishGrade+scienceGrade)/3);
        return ave;
    }
    
    public double getMax(){
        double max;
        max=mathGrade;
        
        max=(max>englishGrade)? max:englishGrade;
        max=(max>scienceGrade)? max:scienceGrade;
        //if(englishGrade>max){
          //  max=englishGrade;
        //}
        //if(scienceGrade>max){
          //  max=scienceGrade;
        //}
        
        return max;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
}
