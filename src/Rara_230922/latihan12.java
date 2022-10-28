/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rara_230922;

/**
 *
 * @author USER
 */
public class latihan12 {
    public static void main(String[]args) {
        int number1 = 50;
        int number2 = 2;
        int number3 = 55;
        int hasil;
        
        hasil = (number1 >=number2)?number1:number2;
        hasil = (number3 >=hasil)?number3:hasil;
        
        System.out.println("Nilai tertingginya = "+hasil);
    }
}
