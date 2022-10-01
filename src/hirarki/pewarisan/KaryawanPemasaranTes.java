/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirarki.pewarisan;

/**
 *
 * @author ASUS
 */
public class KaryawanPemasaranTes {
    public static void main(String[] args) {
        KaryawanPemasaran karyawan = new KaryawanPemasaran(
                "Desi Ekasari","2010080005", 1750000.0,15.0);
        System.out.println("Nama Karyawan   : " + karyawan.getNama());
        System.out.println("Nomor induk     : " + karyawan.getNik());
        System.out.printf("Penjualan Kotor  : Rp. %.2f\n",
                karyawan.getTotalJual());
        System.out.printf("Komisi           : %.2f persen\n",
                karyawan.getPersenKomisi());
        System.out.printf("Honorarium       : Rp. %.2f\n",
                karyawan.getHornorarium());
        karyawan.setTotaljual(3550000);
        karyawan.setPersenKomisi(25);
        System.out.println();
        System.out.println(karyawan);
    }
}