import java.util.Scanner;

public class convert1 {
    public static void main(String[] args) {
        int jam, menit, detik;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jam: ");
        jam = input.nextInt();
        System.out.println("Masukkan menit: ");
        menit = input.nextInt();
        
        detik = jam*3600 + menit*60;
        System.out.println("Hasil konversi = " +detik);
        input.close();
    }
}
