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
public class KaryawanTetapPemasaran extends KaryawanPemasaran{
    private double gajipokok;
    public KaryawanTetapPemasaran(String nama, String nik,
            double total, double komisi, double gajip) {
        super(nama,nik,total,komisi);
        setGajiPokok(gajip);
    }
    public void setGajiPokok(double gaji) {
        gajipokok=gaji;
    }
    public double getGajiPokok() {
        return gajipokok;
    }
    public double getTotalGaji() {
        return gajipokok+super.getHornorarium();
    }
    public String toString() {
        return String.format(
                "%s\nGaji Pokok : Rp. %.2f \nGaji Total: Rp. %.2f\n",
                super.toString(), getGajiPokok(), getTotalGaji());
    }
}
