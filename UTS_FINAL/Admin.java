/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_FINAL;

/**
 *
 * @author iqbal
 */
public class Admin {
    private String nama;
    private Kamar kamar1, kamar2, kamar3;
    private KamarReservasiManager kamarReservasiManager;

    // Konstruktor
    public Admin(String nama, Kamar kamar1, Kamar kamar2, Kamar kamar3) {
        this.nama = nama;
        this.kamar1 = kamar1;
        this.kamar2 = kamar2;
        this.kamar3 = kamar3;
        this.kamarReservasiManager = new KamarReservasiManager();
    }

    public String getNama() {
        return nama;
    }

    public void aksesMenu() {
        System.out.println("Menu untuk Admin:");
        System.out.println("1. Cek Ketersediaan Kamar");
        System.out.println("2. Pesan Kamar untuk Customer");
        System.out.println("3. Lihat Reservasi Customer");
        System.out.println("0. Keluar");
    }

    public void cekKetersediaan() {
        System.out.println("Ketersediaan Kamar:");
        System.out.println("Kamar Nomor: " + kamar1.getNomorKamar() + " - Tersedia: " + kamar1.isTersedia());
        System.out.println("Kamar Nomor: " + kamar2.getNomorKamar() + " - Tersedia: " + kamar2.isTersedia());
        System.out.println("Kamar Nomor: " + kamar3.getNomorKamar() + " - Tersedia: " + kamar3.isTersedia());
    }

    public void pesanKamar(Customer customer, Kamar kamar) {
        kamarReservasiManager.pesanKamar(customer, kamar);
    }

    public void lihatReservasiCustomer(Reservasi reservasi) {
        if (reservasi != null) {
            System.out.println("Reservasi Customer:");
            System.out.println("Kamar Nomor: " + reservasi.getKamar().getNomorKamar() +
                               " - Harga: Rp" + reservasi.getKamar().getHarga() +
                               " - Atas Nama: " + reservasi.getCustomer().getNama());
        } else {
            System.out.println("Belum ada reservasi.");
        }
    }
}





