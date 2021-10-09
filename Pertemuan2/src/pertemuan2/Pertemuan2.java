package pertemuan2;

import javax.swing.JOptionPane;

public class Pertemuan2 {

    
    public static void main(String[] args) {
        // buat program untuk menentukan apakah suatu bilangan bernilai ganjil/genap
        // contoh: bil=3 --> ganjil bil=10 --> genap
        // 3/2=1 sisa 1 10/2=5 sisa 0
        
        int bil = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Bilangan"));
        if(bil%2==1){
            JOptionPane.showMessageDialog(null, bil + " Adalah bilangan Ganjil");
        } else {
            JOptionPane.showMessageDialog(null, bil + " Adalah bilangan Genap");
        }
    }
    
}
