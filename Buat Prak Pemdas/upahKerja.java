import java.util.Scanner;

public class upahKerja {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int jamKerja, upah, lembur, denda;

        System.out.println("===== Program Menghitung Upah Kerja Sederhana =====");
        System.out.println();
        System.out.print("Berapa jumlah jam kerja Anda setiap minggunya? : ");
        jamKerja = input.nextInt();
        System.out.println();
        
        if (jamKerja > 60) {
            upah = jamKerja*5000;
            lembur = (jamKerja-60)*6000;
            denda = 0;
        } else if (jamKerja >= 50) {
            upah = jamKerja*5000;
            lembur = 0;
            denda = 0;
        } else {
            upah = jamKerja*5000;
            lembur = 0;
            denda = (50-jamKerja)*1000;
        }
        System.out.println("Jam kerja\t: " +jamKerja);
        System.out.println("Upah\t = Rp. " +upah);
        System.out.println("Lembur\t = Rp. " +lembur);
        System.out.println("Denda\t = Rp. " +denda);
        System.out.println("-----------------------");
        System.out.println("Total\t = Rp. " +(upah+lembur-denda)); 
    }
}
