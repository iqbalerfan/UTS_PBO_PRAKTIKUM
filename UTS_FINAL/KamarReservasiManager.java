/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_FINAL;

/**
 *
 * @author iqbal
 */
public class KamarReservasiManager {
    public void pesanKamar(Customer customer, Kamar kamar) {
        if (kamar.isTersedia()) {
            Reservasi reservasi = new Reservasi(kamar, customer);
            kamar.setTersedia(false);
            System.out.println("Kamar berhasil dipesan untuk " + customer.getNama());
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }
}

