
package pertemuan1;

import javax.swing.JOptionPane;

public class Pertemuan1b {
    public static void main(String[] args){
        // buat program untuk menghitung luas lingkaran
        // luas Lingkaran pi*r*r;
        
        double pi, r, luas;
        int a;
        a = Integer.valueOf(JOptionPane.showInputDialog("Masukkan a : "));
        
        String nama = String.valueOf(JOptionPane.showInputDialog("Masukkan nama : "));
        
        pi = Double.valueOf(JOptionPane.showInputDialog("Masukkan Pi : "));
        
        r = Double.valueOf(JOptionPane.showInputDialog("Masukkan Jari-jari : "));
        
        luas = pi*r*r;
        
        JOptionPane.showMessageDialog(null, " Luas Lingkaran = " + luas);
    }
}
