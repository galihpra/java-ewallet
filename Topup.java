class TopupData extends Transaction {
    private String nomorReferensi;
    private String metodePembayaran;

    public void setNomorReferensi(String nomorReferensi){
        this.nomorReferensi = nomorReferensi;
    }
    public String getNomorReferensi(){
        return nomorReferensi;
    }

    public void setMetodePembayaran(String metodePembayaran){
        this.metodePembayaran = metodePembayaran;
    }
    public String getMetodePembayaran(){
        return metodePembayaran;
    }

    public TopupData(String nomorReferensi, String metodePembayaran, Integer nominal, String tanggal, String customer){
        super(nominal, tanggal, customer);
        this.nomorReferensi = nomorReferensi;
        this.metodePembayaran = metodePembayaran;
    }

    @Override
    public void cetakTransaksi() {
        
        System.out.println("Transaksi Berhasil");
        System.out.println("Customer: "+getCustomer());
        System.out.println("Tanggal: "+getTanggal());
        System.out.println("Nominal: "+getNominal());
        System.out.println("Nomor Referensi: "+nomorReferensi);
        System.out.println("Metode Pembayaran: "+metodePembayaran);
    }
}

public class Topup{
    public static void main(String[] args) {
        TopupData topup = new TopupData("514721339", "Transfer Bank",250000,"29/05/2024","Tono");
        topup.cetakTransaksi();
    }
}
