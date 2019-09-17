package bus2;
public class ujiBus2 {
    public static void main(String[] args) {
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();        
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}