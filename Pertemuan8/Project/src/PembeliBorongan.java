public class PembeliBorongan extends pembelian{
    PembeliBorongan(String noKTP, String nama, String noHP)
    {
        super(noKTP, nama, noHP);
    }

    public void penjualanMobil(mobil car){
        if (listmobil.size()==0){
            listmobil.add(car);
        }
        else{
            for (int i=0;i<listmobil.size();i++){
                if (listmobil.get(i).getMerkMobil()==car.getMerkMobil()){
                    listmobil.add(car);
                    break;
                }
                else{
                    System.out.println("Hanya dapat membeli satu merk saja");
                }
            }
        }
    }
}
