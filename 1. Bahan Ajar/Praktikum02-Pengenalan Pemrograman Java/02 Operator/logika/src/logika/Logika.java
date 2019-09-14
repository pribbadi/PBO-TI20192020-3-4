package logika;
public class Logika {
    public static void main(String[] args) {
        boolean t=true;
        boolean f=false;
        boolean c;
        c = t && f;
        System.out.println("true && false = " + c);
        c = t || f;
        System.out.println("true && false = " + c);
        System.out.println("true && false = " + !c);
    }  
}
