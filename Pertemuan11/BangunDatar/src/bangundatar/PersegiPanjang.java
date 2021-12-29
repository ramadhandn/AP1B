package bangundatar;

public class PersegiPanjang {
    float panjang, lebar;
    
    float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Lingkaran = " + luas);
        return luas;
    }
    float keliling() {
        float keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling lingkaran adalah = " + keliling);
        return keliling;
    }
}
