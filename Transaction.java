public abstract class Transaction {
    public abstract void cetakTransaksi(); // abstract method

    private Integer nominal;
    private String tanggal;
    private String customer;
    
    public void setNominal(int nominal){
        this.nominal = nominal;
    }
    public Integer getNominal(){
        return nominal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    public String getTanggal(){
        return tanggal;
    }
    
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public String getCustomer(){
        return customer;
    }

    // Constructor
    public Transaction(Integer nominal, String tanggal, String customer){
        this.nominal = nominal;
        this.tanggal = tanggal;
        this.customer = customer;
    }
}
