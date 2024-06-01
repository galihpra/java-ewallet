import java.util.Scanner;

class CustomerData{
    private String nama;
    String alamat;
    private String ewallet;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setEwallet(String ewallet){
        this.ewallet = ewallet;
    }

    public String getEwallet(){
        return ewallet;
    }
}

public class Customer {
    public static void main(String[] args) {
        CustomerData signUp = new CustomerData();

        signUp.setNama("Galih Prayoga");
        System.out.println("Anda terdaftar sebagai "+signUp.getNama());
        
        signUp.alamat = "Wonogiri";
        System.out.println("Alamat yang anda daftarkan adalah "+signUp.alamat);

        signUp.setEwallet("OVO");
        System.out.println("E-wallet yang anda pilih adalah "+signUp.getEwallet());
    }
}