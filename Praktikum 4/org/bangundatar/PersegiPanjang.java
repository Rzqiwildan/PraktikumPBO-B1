package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    // Method hitung luas 
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }

    public void printInfo(){
        System.out.println("Bangun persegi panjang bersisi " + this.getJumlahSisi());
    }
}