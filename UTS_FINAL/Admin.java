/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_FINAL;

/**
 *
 * @author iqbal
 */
public class Admin implements UserManager, KamarManager {
    private String nama;
    private Kamar kamar1, kamar2, kamar3;

    public Admin(String nama, Kamar kamar1, Kamar kamar2, Kamar kamar3) {
        this.nama = nama;
        this.kamar1 = kamar1;
        this.kamar2 = kamar2;
        this.kamar3 = kamar3;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void aksesMenu() {
        System.out.println("Menu untuk Admin:");
        System.out.println("1. Cek Ketersediaan Kamar");
        System.out.println("2. Pesan Kamar untuk Customer");
        System.out.println("3. Lihat Reservasi Customer");
        System.out.println("0. Keluar");
    }

    @Override
    public void cekKetersediaanKamar() {
        System.out.println("Ketersediaan Kamar:");
        System.out.println("Kamar Nomor: " + kamar1.getNomorKamar() + " - Tersedia: " + kamar1.isTersedia());
        System.out.println("Kamar Nomor: " + kamar2.getNomorKamar() + " - Tersedia: " + kamar2.isTersedia());
        System.out.println("Kamar Nomor: " + kamar3.getNomorKamar() + " - Tersedia: " + kamar3.isTersedia());
    }

    @Override
    public Reservasi pesanKamar(Customer customer, Kamar kamar) {
        if (kamar.isTersedia()) {
            kamar.setTersedia(false); // Tandai kamar sebagai tidak tersedia
            System.out.println("Kamar berhasil dipesan untuk " + customer.getNama());
            return new Reservasi(kamar, customer); // Kembali objek reservasi
        } else {
            System.out.println("Kamar tidak tersedia.");
            return null; // Mengembalikan null jika tidak tersedia
        }
    }

    public void lihatReservasiCustomer(Reservasi reservasi) {
        System.out.println("Daftar Reservasi Customer:");
        if (reservasi == null) {
            System.out.println("Tidak ada reservasi yang ditemukan.");
        } else {
            System.out.println("Customer: " + reservasi.getCustomer().getNama() + 
                " - Kamar Nomor: " + reservasi.getKamar().getNomorKamar());
        }
    }
}



