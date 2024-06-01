import java.util.ArrayList;
import java.util.List;

class TransactionDetail {
    String tanggal;
    String customer;

    public TransactionDetail(String tanggal, String customer) {
        this.tanggal = tanggal;
        this.customer = customer;
    }
}

class TransactionData {
    private Integer nominal;
    String tanggal;
    String customer;
    List<TransactionDetail> transactionList = new ArrayList<>();
    
    public void setNominal(int nominal){
        this.nominal = nominal;
    }
    public Integer getNominal(){
        return nominal;
    }
    
    public TransactionData(String tanggal, String customer){
        this.tanggal = tanggal;
        this.customer = customer;

        transactionList.add(new TransactionDetail(tanggal, customer));
    }
}

public abstract class Transaction {
    public abstract void cetakTransaksi(); // abstract method
    public static void main(String[] args) {
        TransactionData transaksi1 = new TransactionData("01/06/24", "Budi");
        TransactionData transaksi2 = new TransactionData("29/05/24", "Tono");
        TransactionData transaksi3 = new TransactionData("28/05/24", "Budi");
        TransactionData transaksi4 = new TransactionData("28/05/24", "Susi");
        TransactionData transaksi5 = new TransactionData("26/05/24", "Hadi");

        transaksi1.setNominal(50000);
        transaksi2.setNominal(98000);
        transaksi3.setNominal(76000);
        transaksi4.setNominal(114000);
        transaksi5.setNominal(92000);


        List<TransactionData> transaksiList = new ArrayList<>();
        transaksiList.add(transaksi1);
        transaksiList.add(transaksi2);
        transaksiList.add(transaksi3);
        transaksiList.add(transaksi4);
        transaksiList.add(transaksi5);

        System.out.println("Daftar Transaksi:");
        for (TransactionData transaksi : transaksiList) {
            System.out.println("Nominal: " + transaksi.getNominal());
            System.out.println("Tanggal: " + transaksi.tanggal);
            System.out.println("Customer: " + transaksi.customer);
            System.out.println("----------------------");
        }
    }
}
