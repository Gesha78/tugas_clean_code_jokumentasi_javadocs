package com.proyek.util;

/**
 *
 * @author
 * @version
 */
public class Kalkulator {

    /**
     *
     * @param bilanganSatu
     * @param bilanganDua
     * @return
     */
    public int tambah(int bilanganSatu, int bilanganDua) {
        return bilanganSatu + bilanganDua;
    }

    /**
     * @param bilanganYangDibagi
     * @param bilanganPembagi
     * @return
     * @throws ArithmeticException Jika {@code bilanganPembagi} adalah 0.
     */
    public double bagi(int bilanganYangDibagi, int bilanganPembagi) {
        if (bilanganPembagi == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return (double) bilanganYangDibagi / bilanganPembagi;
    }
}