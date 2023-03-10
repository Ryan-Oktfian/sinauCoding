import java.util.Scanner;

public class IMT {
    private static final Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double beratBadan, tinggiBadan, IMT;
        String kriteria = "";

        System.out.println("===== Program Menghitung Indeks Massa Tubuh =====");
        System.out.println();
        System.out.print("Masukkan berat badan Anda (dalam kg): ");
        beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan Anda (dalam meter): ");
        tinggiBadan= input.nextDouble();
        System.out.println();

        IMT = beratBadan / Math.pow(tinggiBadan, 2);

        if (IMT <= 18.5){
            kriteria = "Kurus";

        } else if (IMT <= 25){
            kriteria = "Normal";
            
        } else if (IMT <= 30){
            kriteria = "Gemuk";
            
        } else {
            kriteria = "Kegemukan";
            
        }
        System.out.println("Berat badan (kg)\t : " +beratBadan);
        System.out.println("Tinggi badan (m)\t : " +tinggiBadan);
        System.out.printf("IMT = %.2f \t\t   Termasuk %s", IMT, kriteria);
    }
}
