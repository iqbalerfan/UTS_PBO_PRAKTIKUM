/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_FINAL;

/**
 *
 * @author iqbal
 */
public class Kamar {
    private int nomorKamar;
    private double harga;
    private boolean tersedia;

    public Kamar(int nomorKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.harga = harga;
        this.tersedia = true; 
    }

    public int getNomorKamar() {
        return nomorKamar;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
