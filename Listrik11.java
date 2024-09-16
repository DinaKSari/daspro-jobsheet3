import java.util.Scanner;

public class Listrik11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mendeklarasi variable dan tipe data
        int check = 500;
        int penggunaanListrik;
        double harga = 1500.0;
        //menuliskan perintah untuk memasukan data
        System.out.println("Masukan total penggunaan listrik : ");
        penggunaanListrik = input.nextInt();
        //menghitung tarif
        double tagihan = harga * penggunaanListrik;
        //Mengecek penggunaan listrik
        if(penggunaanListrik > check){
            boolean benar = true;
            //menampilkan hasil akhir
            System.out.println("Harga tagihan anda Rp." + tagihan);
            System.out.println("Penggunaan listrik lebih dari 500 " + benar);
        }
        else{
            boolean benar = false;
            System.out.println("Harga tagihan anda Rp." + tagihan);
            System.out.println("Penggunaan listrik kurang dari 500 " + benar);
        }
    }
}
