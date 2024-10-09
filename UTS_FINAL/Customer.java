/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_FINAL;

/**
 *
 * @author iqbal
 */
public class Customer implements User {
    private String nama;
    private Reservasi reservasi;

    // Konstruktor
    public Customer(String nama) {
        this.nama = nama;
        this.reservasi = null;
    }

    public String getNama() {
        return nama;
    }

    public void pesanKamar(Kamar kamar) {
        if (kamar.isTersedia()) {
            reservasi = new Reservasi(kamar, this);
            kamar.setTersedia(false);
            System.out.println("Kamar berhasil dipesan.");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    public void lihatReservasi() {
        System.out.println("Reservasi yang dimiliki oleh " + nama + ":");
        if (reservasi == null) {
            System.out.println("Anda belum memiliki reservasi.");
        } else {
            System.out.println("Kamar Nomor: " + reservasi.getKamar().getNomorKamar() + 
                               " - Harga: Rp" + reservasi.getKamar().getHarga());
        }
    }

    @Override
    public void aksesMenu() {
        System.out.println("Menu untuk Customer:");
        System.out.println("1. Lihat Reservasi");
        System.out.println("2. Pesan Kamar");
        System.out.println("0. Keluar");
    }
}
