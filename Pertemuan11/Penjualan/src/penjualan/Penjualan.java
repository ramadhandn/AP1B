package penjualan;

import javax.swing.JOptionPane;

public class Penjualan {

    private String nama;
    private int harga, jumlah, total;
    
    public Penjualan(String _nama, int _harga, int _jumlah) {
        nama = _nama;
        harga = _harga;
        jumlah = _jumlah;
    }
    
    public int Total() {
        total = harga * jumlah;
        return total;
    }
    
    public void Tampilkan() {
        System.out.println("Nama barang : " + nama);
        System.out.println("Harga barang : " + harga);
        System.out.println("Jumlah yang dibeli : " + jumlah);
        System.out.println("-------------------------------");
        System.out.println("Total Harga : " + total);
    }
    
    public static void main(String[] args) {
        String nama = String.valueOf(JOptionPane.showInputDialog("Masukkan nama :"));
        int harga = Integer.valueOf(JOptionPane.showInputDialog("Masukkan harga :"));
        int jumlah = Integer.valueOf(JOptionPane.showInputDialog("Masukkan jumlah :"));
        Penjualan pj = new Penjualan(nama, harga, jumlah);
        
        pj.Tampilkan();
        pj.Total();
    }
    
}
