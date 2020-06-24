/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2no2;

/**
 *
 * @author Gin
 */
public class KomputerCetak {
    public static void main(String[] args) { 
        PersonalComputer PC = new PersonalComputer();
        Notebook NT = new Notebook();
        Netbook NB = new Netbook();
        
        PC.hidupkan_os();
        PC.klik_kanan();
        PC.matikan_os();
        System.out.println("-----------------------------");
        NT.klik_kanan();
        NT.enter();
        System.out.println("-----------------------------");
        NB.hidupkan_os();
        NB.enter();
        NB.klik_kiri();
        NB.cetak_data();
    }
}
