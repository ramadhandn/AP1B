package bangundatar;

public class Lingkaran extends BangunDatar {
    float r;
    
    float luas() {
        float luas = (float)(Math.PI * r * r);
        System.out.println("Luas Lingkaran" + luas);
        return luas;
    }
}
