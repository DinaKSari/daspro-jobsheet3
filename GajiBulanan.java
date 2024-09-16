import java.util.Scanner;

public class GajiBulanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamKerja;
        int upah;
        double bonus =  0.10;
        double pajak = 0.05;
        //tampilan tanya
        System.out.println("jumlah jam : ");
        jamKerja =  input.nextInt();
        System.out.println("Upah per jam : ");
        upah = input.nextInt();
        //operasi
        int totalGaji = jamKerja * upah;
        double totalBonus = bonus * totalGaji;
        int totalGajiPlusBonus = totalGaji + (int)totalBonus;
        double totalPajak = pajak * totalGajiPlusBonus;
        double gajiBersih = totalGajiPlusBonus - totalPajak;
        //hasil akhir
        System.out.println("Total gaji Rp." + totalGaji);
        System.out.println("Bonus Rp." + totalGajiPlusBonus);
        System.out.println("Pajak Rp." + totalPajak);
        System.out.println("Gaji bersih Rp." + gajiBersih);


    }
}
