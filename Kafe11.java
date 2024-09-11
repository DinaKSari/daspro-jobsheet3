import java.util.Scanner;

public class Kafe11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mendeklarasi variable dan tipe data
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        //menuliskan perintah untuk memasukan data
        System.out.println("Masukan keanggotaan (true/false) : ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukan jumlah pembelian kopi : ");
        jmlKopi = input.nextInt();
        System.out.println("Masukan jumlah pembelian teh : ");
        jmlTeh = input.nextInt();
        System.out.println("Masukan jumlah pembelian roti : ");
        jmlRoti = input.nextInt();
        //menghitung total harga
        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        //menghitung nominal pembayaran
        double nominalBayar = totalHarga - (diskon * totalHarga);
        //menuliskan hasil akhir
        System.out.println("Keanggotaan pelanggan ");
        System.out.println("Item pembelian " + jmlKopi + " kopi " + jmlTeh + " teh " + jmlRoti + " roti ");
        System.out.println("Nominal bayar Rp.- " + nominalBayar);
    }
}
