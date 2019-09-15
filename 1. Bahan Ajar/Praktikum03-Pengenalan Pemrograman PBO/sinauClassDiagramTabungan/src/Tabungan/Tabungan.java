package Tabungan;
public class Tabungan {
    public int saldo=5000;
    public Tabungan (int initsaldo){
        initsaldo=saldo;
    }
    public void ambilUang (int jumlah){
        saldo-=jumlah;
    }
}
