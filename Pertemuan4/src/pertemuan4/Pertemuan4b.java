package pertemuan4;

import javax.swing.JOptionPane;

public class Pertemuan4b {
    
    public static void main(String[] args){
        int bil, pangkat;
        bil = Integer.valueOf(JOptionPane.showInputDialog("Masukkan bilangan"));
        pangkat = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Pangkat"));
        JOptionPane.showMessageDialog(null, bil + " Pangkat " + pangkat + " = " + hitungPangkat(bil,pangkat));
    }
    
    static int hitungPangkat(int x, int y){
        if(y == 0){
            return 1;
        }
        else {
            return x * hitungPangkat(x, y - 1);
        }
    }
    
    
}
