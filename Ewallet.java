import java.util.ArrayList;
import java.util.List;

class dataEwallet {
    private int saldo;
    List<String> transactionList = new ArrayList<>();

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    // Constructor
    public dataEwallet() {
        this.saldo = 0;
    }

    public void topup(int nominal){
        this.saldo += nominal;
        transactionList.add("Top up sebesar: "+nominal);
    }
    
    public void transfer(int nominal){
        this.saldo -= nominal;
        transactionList.add("Transfer sebesar: "+nominal);
    }

    public void cekSaldo(){
        System.out.println("Jumlah saldo anda: "+this.saldo);
    }

    public void cekTransaksi(){
        System.out.println("Riwayat transaksi:");
        for (String transaction : transactionList) {
            System.out.println(transaction);
        }
    }
}

public class Ewallet {
    public static void main(String[] args) {
        dataEwallet ewallet = new dataEwallet();
        ewallet.setSaldo(1000000);
        ewallet.topup(500000);
        ewallet.transfer(250000);
        ewallet.topup(50000);
        ewallet.transfer(12000);
        ewallet.cekSaldo();
        ewallet.cekTransaksi();
    }
    
}
