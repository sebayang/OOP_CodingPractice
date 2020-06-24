/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exersice2no1;

/**
 *
 * @author Gin
 */
import java.io.IOException;
import java.util.Scanner;
final class OprasiBilanganAbsCetak {
    
    private static void cetakSemua(OprasiBilanganAbs[] OB,  double a, double b) {
        OB[0] = new OprasiPenjumlahan(); 
        OB[0].setA(a);
        OB[0].setB(b);
        OB[0].tampil();
        OB[1] = new OprasiPengurangan(); 
        OB[1].setA(a);
        OB[1].setB(b);
        OB[1].tampil();
        OB[2] = new OprasiPerkalian(); 
        OB[2].setA(a);
        OB[2].setB(b);
        OB[2].tampil();
        OB[3] = new OprasiPembagian(); 
        OB[3].setA(a);
        OB[3].setB(b);
        OB[3].tampil();
    }
    private static void cetakSemua(double a, double b) {
        OprasiPenjumlahan jumlah = new OprasiPenjumlahan();
        jumlah.setA(a);
        jumlah.setB(b); 
        jumlah.tampil();
        OprasiPengurangan kurang = new OprasiPengurangan();
        kurang.setA(a);
        kurang.setB(b); 
        kurang.tampil();
        OprasiPerkalian kali = new OprasiPerkalian();
        kali.setA(a);
        kali.setB(b); 
        kali.tampil();
        OprasiPembagian bagi = new OprasiPembagian();
        bagi.setA(a);
        bagi.setB(b); 
        bagi.tampil();
    }
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        try{
            System.out.print ("Masukan Nilai 1 :");
            int a = input.nextInt();
            System.out.print ("Masukan Nilai 2 :");
            int b = input.nextInt(); 
            cetakSemua(a,b);
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Masukan tidak boleh String");
        }
          
    }
}
