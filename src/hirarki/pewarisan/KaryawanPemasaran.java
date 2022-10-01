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
class KaryawanPemasaran extends Object {
    private String nama;
    private String nik;
    private double totalJual;
    private double perseKomisi;
    public KaryawanPemasaran(String nama, String nik,
            double total, double komisi) {
        this.nama = nama;this.nik = nik;
        this.totalJual = total; this.perseKomisi=komisi;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setTotaljual(double tj) {
        totalJual =(tj<0.0)?0.0:tj;
    }
    public void setPersenKomisi(double pk) {
        perseKomisi =(pk>0.0 && pk<=100.0)?pk:0.0;
    }
    public double getPersenKomisi(){
        return perseKomisi;
    }
    public double getHornorarium(){
        return totalJual*perseKomisi/100;
    }
    public String toString(){
        return String.format("%s%s, %s%s\n%s%.2f, %s%.if, %s%.2f\n ",
                "Karyawan pemasaran : ", nama, "NIK:", nik,
                "Total penjualan: Rp. ", totalJual, "Komisi:",
                perseKomisi, "Honorarium: Rp. ", getHornorarium());
    }
    public String getNama(){
    return nama;
}
public String getNik(){
    return nik;
}
public double getTotalJual(){
    return totalJual;
}
}
