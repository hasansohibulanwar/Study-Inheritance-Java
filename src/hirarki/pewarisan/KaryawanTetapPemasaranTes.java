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
public class KaryawanTetapPemasaranTes {
    public static void main(String[] args) {
        KaryawanTetapPemasaran ktp = new KaryawanTetapPemasaran(
        "Hasan Sohib", "111-111-111", 7500000, 15,2000000);
        System.out.println("Nama Karyawan : "+ktp.getNama());
        System.out.println("Nik Karyawan  : "+ktp.getNik());
        System.out.println("Gaji Pokok    : "+ktp.getGajiPokok());
        System.out.println("Honorarium    : "+ktp.getHornorarium());
        System.out.println("Total Gaji    : "+ktp.getTotalGaji());
        System.out.println("Tapilan ktp/objek:");
        System.out.println(ktp);
        
    }
}
