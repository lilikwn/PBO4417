import java.util.ArrayList;

public class pembelian extends harga {
    
    //Atrribute
    public String nama;
    public String noKTP;
    public String noHP;
    
    public ArrayList<mobil> listmobil;
    
    //Constructor
    pembelian(){
        listmobil = new ArrayList<mobil>();
        nama="Undefined";
        noKTP="01";
        noHP="081";
    }
    
    pembelian(String nama, String noKTP, String noHP){
        listmobil = new ArrayList<mobil>();
        this.nama=nama;
        this.noKTP=noKTP;
        this.noKTP=noHP;
    }

    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNoKTP(String KTP){
        this.noKTP=noKTP;
    }
    
    public String getNoKTP(){
        return noKTP;
    }
    
    public void setHarga(int harga){
        this.harga=harga;
    }

    public int getHarga(){
        return harga;
    }
    
    public void jualbeliMobil(mobil mobil1){
        if (listmobil.size()==0){
            listmobil.add(mobil1);
        }
        else{
            for (int y=0;y<listmobil.size();y++){
                if (listmobil.get(y).getMerkMobil()==mobil1.getMerkMobil()){
                    listmobil.add(mobil1);
                    break;    
                }
                else{
                    System.out.println("Hanya boleh beli mobil satu merk");
                }
            }
        }
    }
    
    public void setting(individu x){
        int tambahHarga;
        int totalHarga;

        totalHarga=0;
        for (int i=0;i<x.listmobil.size();i++){
            tambahHarga = x.listmobil.get(i).getHarga()*10/100;
            totalHarga = totalHarga + tambahHarga;
        }
        
        System.out.println("Nama : "+nama);
        System.out.println("No KTP : "+noKTP);
        System.out.println("No KTP : "+noHP);               
        System.out.println("Total Tips Karyawan = "+totalHarga);
    }
    
    public void fakturKonsumen(){
        System.out.println("Konsumen");
        System.out.println("Nama : "+nama);
        System.out.println("No KTP : "+noKTP);
        System.out.println("No KTP : "+noHP);   
        System.out.println("List mobil yang ditambah : ");
        for (int i=0;i<listmobil.size();i++){
            System.out.println(i+1+" "+listmobil.get(i).getMerkMobil()+" harga : "+listmobil.get(i).getHarga());
        }
    }
    public void fakturKaryawan(){
        System.out.println("Karyawan");
        System.out.println("Nama : "+nama);
        System.out.println("No KTP : "+noKTP);
        System.out.println("No KTP : "+noHP);   
        }    
}
    
