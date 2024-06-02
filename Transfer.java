class DataTrasfer extends Transaction{
    private String penerima;

    public void setPenerima(String penerima){
        this.penerima=penerima;
    }
    public String getPenerima(){
        return penerima;
    }

    public DataTrasfer(String penerima, Integer nominal, String tanggal, String customer){
        super(nominal, tanggal, customer);
        this.penerima = penerima;        
    }

    @Override
    public void cetakTransaksi() {
        
        System.out.println("Transfer Berhasil");
        System.out.println("Pengirim: "+getCustomer());
        System.out.println("Tanggal: "+getTanggal());
        System.out.println("Nominal Transfer: "+getNominal());
        System.out.println("Nama Penerima: "+getPenerima());
    }
}
public class Transfer {
    public static void main(String[] args) {
        DataTrasfer transfer = new DataTrasfer("Juliet", 100000, "01/06/2024", "Tono");
        transfer.cetakTransaksi();
    }
}
