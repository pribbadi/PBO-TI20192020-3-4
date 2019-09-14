package assignment;
public class Assignment {
    public static void main(String[] args) {
        int a=5;
        int b=10;        
        b += a;
        System.out.println("Penambahan : " + b);
        b -= a;
        System.out.println("Pengurangan : " + b);
        b *= a;
        System.out.println("Perkalian : " + b);
        b /= a;
        System.out.println("Pembagian : " + b);
        b %= a;
        System.out.println("Sisa Bagi: " + b);
    }
}
