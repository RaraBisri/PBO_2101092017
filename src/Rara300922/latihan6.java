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
import javax.swing.JOptionPane;
public class latihan6 {
    public static void main( String[] args ){ 
        
        String word1="";
        String word2="";
        String word3="";
        String pesan ="";
        
        word1 = JOptionPane.showInputDialog("Enter Word1"); 
         
        
        word2 =JOptionPane.showInputDialog("Enter Word2"); 
        
        word3 =JOptionPane.showInputDialog("Enter Word3"); 

        pesan = word1 + word2 + word3;
        
        JOptionPane.showMessageDialog(null,pesan ); 

     }
}
