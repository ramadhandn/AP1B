package pertemuan3;

import java.util.Scanner;

public class Pertemuan3f {
    static Scanner H = new Scanner(System.in);
    public static void main(String[] args){
        boolean running = true;
        int counter = 0;
        String jwb;
        while(running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab Ya/Tidak : ");
            jwb = H.nextLine();
            if(jwb.equalsIgnoreCase("Ya")){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak : " + counter + " kali");
    }
}
