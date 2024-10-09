/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_FINAL;

/**
 *
 * @author iqbal
 */
public class Reservasi {
    private Kamar kamar;
    private Customer customer;

    public Reservasi(Kamar kamar, Customer customer) {
        this.kamar = kamar;
        this.customer = customer;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public Customer getCustomer() {
        return customer;
    }
}