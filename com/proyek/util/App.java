package com.proyek.util;

public class App {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("Memulai demonstrasi Kalkulator...");

        jalankanTesPenjumlahan(kalkulator);
        jalankanTesPembagianValid(kalkulator);
        jalankanTesPembagianError(kalkulator);
        
        System.out.println("\nDemonstrasi selesai.");
    }

    private static void jalankanTesPenjumlahan(Kalkulator kalkulator) {
        System.out.println("\n--- Tes Penjumlahan ---");
        int angkaPertama = 25;
        int angkaKedua = 10;
        int hasilPenjumlahan = kalkulator.tambah(angkaPertama, angkaKedua);
        
        System.out.println("Hasil: " + angkaPertama + " + " + angkaKedua + " = " + hasilPenjumlahan);
    }

    private static void jalankanTesPembagianValid(Kalkulator kalkulator) {
        System.out.println("\n--- Tes Pembagian Valid ---");
        int angkaYangDibagi = 10;
        int angkaPembagi = 4;
        double hasilPembagian = kalkulator.bagi(angkaYangDibagi, angkaPembagi);
        
        System.out.println("Hasil: " + angkaYangDibagi + " / " + angkaPembagi + " = " + hasilPembagian);
    }

    private static void jalankanTesPembagianError(Kalkulator kalkulator) {
        System.out.println("\n--- Tes Pembagian Error (Oleh Nol) ---");
        int angkaYangDibagi = 5;
        int angkaPembagiNol = 0;

        try {
            kalkulator.bagi(angkaYangDibagi, angkaPembagiNol);
        } catch (ArithmeticException e) {
            System.out.println("Berhasil ditangkap! Error: " + e.getMessage());
        }
    }
}