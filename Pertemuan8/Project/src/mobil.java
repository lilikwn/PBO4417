public class mobil {
    
    private String idMobil;
    private String merkMobil;
    public int harga;

    // konstruktor
    mobil(){
        idMobil="H1";
        merkMobil="Undefined";
        harga=5;
    }

    mobil(String idMobil, String merkMobil, int Harga){
        this.idMobil=idMobil;
        this.merkMobil=merkMobil;
        this.harga=harga;
    }

    // method
    public void setID(String idMobil){
        this.idMobil=idMobil;
    }

    public String getID(){
        return idMobil;
    }

    public void setMerkMobil(String merkMobil){
        this.merkMobil=merkMobil;
    }

    public String getMerkMobil(){
        return merkMobil;
    }

    public void setHarga(int harga){
        this.harga=harga;
    }

    public int getHarga(){
        return harga;
    }
}

