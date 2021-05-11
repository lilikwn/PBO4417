public class individu extends pembelian{
    
    individu(String nama, String noKTP, String noHP){
        super(nama,noKTP,noHP);
    }

    public void jualMobil(mobil mobill){
        if (listmobil.size()==0){
            listmobil.add(mobill);
        }
        else{
            for (int y=0;y<listmobil.size();y++){
                if (listmobil.get(y).getMerkMobil()==mobill.getMerkMobil()){
                    listmobil.add(mobill);
                    break;    
                }
                else{
                    System.out.println("Hanya boleh 1 mobil");
                }
            }
        }
    }
}
