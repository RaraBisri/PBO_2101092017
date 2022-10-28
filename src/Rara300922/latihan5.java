/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rara300922;

/**
 *
 * @author USER
 */
 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan5 {
    public static void main( String[] args ){ 
 
        BufferedReader dataIn = new BufferedReader( 
            new InputStreamReader( System.in) ); 
        String word1 = ""; 
        String word2 = "";
        String word3 = "";
        

        try{
            System.out.print("Please Enter Your first word:");
            word1 = dataIn.readLine(); 
            System.out.print("Please Enter Your second word:");
            word2 = dataIn.readLine(); 
            System.out.print("Please Enter Your third word:");
            word3 = dataIn.readLine(); 
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
            System.out.print( word1 +" "); 
            System.out.print( word2 +" "); 
            System.out.print( word3 +"! "); 
        }
}

