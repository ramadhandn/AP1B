package pertemuan2;

import java.util.Scanner;

public class Pertemuan2b {
    static Scanner apaaja = new Scanner(System.in); 
    public static void main(String[] args){
        // seorang pegawai kan mendapat bonus 5% dari harga jual jika berhasil menjual barang diatas
        // harga toko dan beri pesan selamat
        // buat program java untuk ilustrasi
        
        double bonus , hargajual, hargatoko;
        System.out.print("Masukkan harga jual : ");
        
        hargajual = apaaja.nextDouble();
        System.out.print("Masukkan harga toko : ");
        
        hargatoko = apaaja.nextDouble();
        System.out.println("");
        
        if(hargajual > hargatoko){
            bonus = 0.05 * hargajual;
            System.out.println("Selamat!! bonus anda Rp." + bonus);
        } else {
            bonus = 0;
            System.out.println("Bonus anda Rp." + bonus + "Tetap semangat yaa!!");
        }
        
    }
}
