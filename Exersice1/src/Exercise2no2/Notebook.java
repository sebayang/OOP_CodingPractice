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
public class Notebook extends Komputer{
    private boolean isActive = false;
    @Override
    public void hidupkan_os() {
            System.out.println("Hidupkan Persoan Computer");
        this.isActive = true;
    }

    @Override
    public void matikan_os() {
            System.out.println("Matikan Persoan Computer");
        this.isActive = false;
    }
    
    @Override
    public void enter() {
        if (this.isActive == true){
            System.out.println("Melakukan Enter pada Keyboard");
        }else{
            System.out.println("Hidupkan Komputer Terlebih Dahulu");
        }  
    }

    @Override
    public void klik_kanan() {
        if (this.isActive == true){
            System.out.println("Melakukan Klik Kanan pada Mouse");
        }else{
            System.out.println("Hidupkan Komputer Terlebih Dahulu");
        }  
    }

    @Override
    public void klik_kiri() {
        if (this.isActive == true){
            System.out.println("Melakukan Klik Kiri pada Mouse");
        }else{
            System.out.println("Hidupkan Komputer Terlebih Dahulu");
        }  
    }

    @Override
    public void cetak_data() {
        if (this.isActive == true){
            System.out.println("Melakukan Cetak Data pada Printer");
        }else{
            System.out.println("Hidupkan Komputer Terlebih Dahulu");
        }  
    }
}
