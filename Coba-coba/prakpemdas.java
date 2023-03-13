import java.util.Scanner;


public class prakpemdas {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
    //System.out.println("Hello world!");

        System.out.println("Program menghitung luas lingkaran sederhana");
        System.out.println();

        System.out.print("Masukkan phi : ");
        double phi = input.nextDouble();
        System.out.print("Masukkan jari-jari :");
        double jari = input.nextDouble();

        double hasil = phi * Math.pow(jari, 2);

        System.out.println("Hasil dari luas lingkaran tersebut adalah : " +hasil);

    }
}