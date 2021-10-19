package pertemuan4;

public class Pertemuan4 {
    static String mhsw[]={"Fawzul","Raihan","Dika","Gede"}; //array[]
    
    public static void main(String[] args) { //method main
        getMhsw(0); //pemanggilan method
    }
    
    static void getMhsw(int absensi){
        if(absensi < mhsw.length){
            System.out.println("Absensi No-"+(absensi+1)+"Bernama : " + mhsw[absensi]);
            getMhsw(++absensi); //rekursif
        }
    }
    
}
