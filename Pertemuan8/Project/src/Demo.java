import java.util.Scanner;

public class Demo extends data_mobil {
    public static void main(String[] agr){
        String DataNamaPembeli;
        String DataNoKTPPembeli;
        String DataNoHpPembeli;
        String DataNamaKaryawan;
        String DataNoKTPKaryawan;
        String DataNoHPKaryawan;
        String Jenis;
        String TipeMobil;
        String SettingHarga;
        int newHargaa;
        boolean option;

        Scanner DataNamaPembeli_scan = new Scanner(System.in);
        Scanner DataNoKTPPembeli_scan = new Scanner(System.in);
        Scanner DataNoHPPembeli_scan = new Scanner(System.in);
        Scanner Jenis_scan = new Scanner(System.in);
        Scanner DataNamaKaryawan_scan = new Scanner(System.in);
        Scanner DataNoKTPKaryawan_scan = new Scanner(System.in);
        Scanner DataNoHPKaryawan_scan = new Scanner(System.in);
        Scanner TipeMobil_scan = new Scanner(System.in);
        Scanner SettingHargascan = new Scanner(System.in);
        Scanner newHargascan = new Scanner(System.in);


        System.out.print("Nama: ");
        DataNamaKaryawan = DataNamaKaryawan_scan.nextLine();
        System.out.print("No KTP: ");
        DataNoKTPKaryawan = DataNoKTPKaryawan_scan.nextLine();
        System.out.print("No HP: ");
        DataNoHPKaryawan = DataNoHPKaryawan_scan.nextLine();
        pembelian karyawan1 = new pembelian(DataNamaKaryawan,DataNoKTPKaryawan,DataNoHPKaryawan);


        option=true;

        if(DataNamaKaryawan != null ) {
            option =true;
        }

        else{
            option =false;
        }

        if(option == true){
            System.out.println("1. Individu");
            System.out.println("2. Borongan");
            System.out.println("Pelanggan Individu atau Borongan ?");
            System.out.print("Jenis: ");
            Jenis = Jenis_scan.nextLine();
        }
    }
}
