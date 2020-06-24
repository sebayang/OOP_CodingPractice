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
public class OprasiPengurangan extends OprasiBilanganAbs{
    protected double a,b,c;
    
    @Override
    protected double getA() {
        return this.a;
    }

    @Override
    protected void setA(double a) {
        this.a = a;
    }

    @Override
    protected double getB() {
        return this.b;
    }

    @Override
    protected void setB(double b) {
        this.b = b;
    }

    @Override
    protected double getC() {
        return this.c;
    }

    @Override
    protected void setC(double c) {
        this.c = c;
    }

    @Override
    protected void tampil() {
        double hasil;
        hasil = this.a - this.b - this.c;
        System.out.println("Hasil Pengurangan A + B + C = " + hasil);
    }
    
    protected void tampil(double a, double b) {
        double hasil;
        hasil = this.a - this.b;
        System.out.println("Hasil Pengurangan A + B = " + hasil);
    }
}
