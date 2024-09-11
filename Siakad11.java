import java.util.Scanner;

public class Siakad11 {
    public static void main ( String[] args){
        //mendeklarasi scanner dengan nama sc
        Scanner sc = new Scanner (System.in);
        //mendeklarasikan semua variable dengan tipe data
        String nama,nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        //menuliskan perintah untuk memasukan data dengan memanfaatkan scanner
        System.out.print("Masukan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan nomor absen : ");
        absen = sc.nextByte();
        //menuliskan perintah untuk memasukan data nilai
        System.out.print("Masukan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai ujian : ");
        nilaiUjian = sc.nextDouble();
        //menghitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        //menuliskan hasil akhir
        System.out.println("Nama : " + nama + " NIM : " + nim);
        System.out.println("Kelas : " + kelas + " Absen : " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
    }
}