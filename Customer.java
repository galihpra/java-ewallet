import java.util.Scanner;

class CustomerData{
    private String nama;
    String alamat;
    private String ewallet;

    public void inputData(Scanner scanner) {
        System.out.print("Masukkan nama anda: ");
        this.nama = scanner.nextLine();

        System.out.print("Masukkan alamat anda: ");
        this.alamat = scanner.nextLine();

        System.out.print("Masukkan e-wallet yang anda pilih: ");
        this.ewallet = scanner.nextLine();
    }

    public String getNama(){
        return nama;
    }

    public String getEwallet(){
        return ewallet;
    }
}

public class Customer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CustomerData signUp = new CustomerData();
        signUp.inputData(input);
        
        System.out.println("======================= Pendaftaran Berhasil!!! =======================");
        System.out.println("Anda terdaftar sebagai: "+signUp.getNama());
        System.out.println("E-wallet yang anda pilih adalah: "+signUp.getEwallet());
        System.out.println("Alamat yang anda daftarkan adalah "+signUp.alamat);
    }
}