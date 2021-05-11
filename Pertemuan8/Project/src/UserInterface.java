import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nama: ");
        String nama = scanner.nextLine();
        System.out.print("Input nomor KTP: ");
        String ktp = scanner.nextLine();

        System.out.println("Pilih Status Karyawan / Konsumen : ");
        System.out.println("1. Karyawan");
        System.out.println("2. Konsumen");
        int stat = scanner.nextInt();
        if(stat == 1){
            System.out.println("Update harga kendaraan 1/2/3");
            System.out.println("1. Sedan");
            System.out.println("2. Minibus");
            System.out.println("3. Bus");
            int updateCar= scanner.nextInt();
        }
        else if(stat == 2){
            System.out.println("beli mobil: ");
            System.out.println("1. Sedan");
            System.out.println("2. Minibus");
            System.out.println("3. Bus");
            int buyCar= scanner.nextInt();
            if(buyCar == 1){
                System.out.println("daftar mobil sedan yang tersedia : ");
                System.out.println("1. Toyota Supra (500JT)");
                System.out.println("2. Mitsubishi Lancer evo VIII (400JT)");
                System.out.println("3. Honda Integra type-R (470jt)");
                System.out.println("=>");
                int sedan = scanner.nextInt();
                System.out.println("banyak Unit mobil yang dibeli");
                int jumlahSedan = scanner.nextInt();
                switch (sedan){
                    case 1:

                        System.out.println("==========Mobil Sedan==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 1 \n Tipe : Toyota Supra \n Harga : 500JT");
                        System.out.println("banyak unit : "+jumlahSedan);
                        System.out.println("Total : "+jumlahSedan*500000000);
                        break;
                    case 2:

                        System.out.println("==========Mobil Sedan==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 2 \n itsubishi Lancer evo VIII  \n Harga : 400JT ");
                        System.out.println("Jumlah Pesan : "+jumlahSedan);
                        System.out.println("Total : "+jumlahSedan*400000000);
                        break;
                    case 3:

                        System.out.println("==========Mobil Sedan==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 3 \n Nama Mobil : Honda Integra type-R \n Harga : 470JT");
                        System.out.println("Jumlah Pesan : "+jumlahSedan);
                        System.out.println("Total : "+jumlahSedan*470000000);
                        break;

                }
            }
            else if(buyCar == 2){
                System.out.println("daftar mobil Minibus yang tersedia : ");
                System.out.println("1. Isuzu Elf (280JT)");
                System.out.println("2. GranMax (170JT)");
                System.out.println("3. Daihatsu Luxio (200jt)");
                System.out.println("=>");
                int minibus = scanner.nextInt();
                System.out.println("banyak Unit mobil yang dibeli");
                int jumlahMinibus = scanner.nextInt();
                switch (minibus){
                    case 1:

                        System.out.println("==========Mobil Minibus==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 1 \n Tipe : Isuzu elf \n Harga : 280JT");
                        System.out.println("banyak unit : "+jumlahMinibus);
                        System.out.println("Total : "+jumlahMinibus*280000000);
                        break;
                    case 2:

                        System.out.println("==========Mobil Minibus==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 2 \n Tipe : GranMax  \n Harga : 170JT ");
                        System.out.println("Jumlah Pesan : "+jumlahMinibus);
                        System.out.println("Total : "+jumlahMinibus*170000000);
                        break;
                    case 3:

                        System.out.println("==========Mobil Minibus==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 3 \n Tipe : Daihatsu Luxio \n Harga : 200JT");
                        System.out.println("Jumlah Pesan : "+jumlahMinibus);
                        System.out.println("Total : "+jumlahMinibus*200000000);
                        break;

                }
            }
            else if(buyCar == 3){
                System.out.println("daftar mobil BUS yang tersedia : ");
                System.out.println("1. Jetbus Setra (500JT)");
                System.out.println("2. Jetbus (400 JT)");
                System.out.println("3. Jetbus 3 UHD (550 JT)");
                System.out.println("=>");
                int bus = scanner.nextInt();
                System.out.println("banyak Unit mobil yang dibeli");
                int jumlahBus = scanner.nextInt();
                switch (bus){
                    case 1:

                        System.out.println("==========Mobil Bus==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 1 \n Tipe : Jetbus Setra \n Harga : 500 JT");
                        System.out.println("banyak unit : "+jumlahBus);
                        System.out.println("Total : "+jumlahBus*500000000);
                        break;
                    case 2:

                        System.out.println("==========Mobil Minibus==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 2 \n Tipe : Jetbus  \n Harga : 400JT ");
                        System.out.println("Jumlah Pesan : "+jumlahBus);
                        System.out.println("Total : "+jumlahBus*400000000);
                        break;
                    case 3:

                        System.out.println("==========Mobil Minibus==========");
                        System.out.println("Mobil dengan atas nama : "+ nama);
                        System.out.println("No.KTP : "+ ktp);
                        System.out.println("Mobil 3 \n Tipe : Jetbus 3 UHD \n Harga : 550JT");
                        System.out.println("Jumlah Pesan : "+jumlahBus);
                        System.out.println("Total : "+jumlahBus*550000000);
                        break;

                }
            }
        }
    }
}
