package pertemuan2;

import javax.swing.*;

public class Pertemuan2d {
    public static void main(String[] args){
        /*
            buat program untuk menentukan grade nilai dengan ketentuan berikut
            jika nilai 80-100 mendapat grade A;
            jika nilai 70-79 mendapat grade B;
            jika nilai 55-69 mendapat grade C;
            jika nilai 40-54 mendapat grade D;
            jika nilai 0-39 mendapat grade E;
        */
        
        //Cara ke-1
        /*
        int nilai;
        nilai = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Nilai"));
        if(nilai >= 80 & nilai <= 100){
            JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade A");
        } 
        else if(nilai >= 70 & nilai <= 79){
            JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade B");
        } 
        else if(nilai >= 55 & nilai <= 69){
            JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade C");
        } 
        else if(nilai >= 40 & nilai <= 54){
            JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade D");
        } 
        else if(nilai >= 0 & nilai <= 39){
            JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade E");
        } else {
            JOptionPane.showMessageDialog(null,"Masukkan nilai [0-100]");
        }
        */
        
        // Cara ke-2
        int nilai;
        nilai = Integer.valueOf(JOptionPane.showInputDialog("Masukkan Nilai"));
        if(nilai >= 80 & nilai <= 100){
            JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade A");
        }
        else {
            if(nilai >= 70 & nilai <= 79){
                JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade B");
            } 
            if(nilai >= 55 & nilai <= 69){
                JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade C");
            } 
            if(nilai >= 40 & nilai <= 54){
                JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade D");
            } 
            if(nilai >= 0 & nilai <= 39){
                JOptionPane.showMessageDialog(null, nilai + " Anda mendapat Grade E");
            }
        }
        
        
    }
}
