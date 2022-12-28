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

public class TestException{
    public static void main( String[] args ){
        try{
            for( int i=0; true; i++ ){
                System.out.println("args["+i+"]="+args[i]); 
            }
        }
        
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception caught:\n"+"java.lang.ArrayIndexOutOfBoundsException: 3");
        }
        
        finally{
            System.out.println("Quitting");
        }
    }
}

