/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki191022;

/**
 *
 * @author LENOVO
 */

import javax.swing.JOptionPane;

public class Latihan1Joption {
    public static void main(String[] args) {
        
        double grade = 0;
        String msg = "";
        
        grade = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Nilai Anda")) ;
        
        if (grade >= 90){
            msg = "Excellent!";
        }
        else if ((grade < 90) && (grade >= 80)){
            msg = "Good Job";
        }
        else if ((grade < 80) && (grade >= 60)){
            msg = "Study Harder !";
        }
        else{
            msg = "Sorry, Your Failed";
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }    
}

