import java.util.Scanner;
//import java.lang.Math;

public class sks {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double indeksPrestasi;
        
        System.out.println("Berapa IP Anda?");
        indeksPrestasi = input.nextDouble();
        if (indeksPrestasi >= 3.00) {
            System.out.println("Anda berhak mengambil 24 SKS");
        } else {
            if (indeksPrestasi >= 2.50 && indeksPrestasi < 3.00) {
                System.out.println("Anda berhak mengambil 21 SKS");
            } else {
                if (indeksPrestasi >= 2.00 && indeksPrestasi < 2.50) {
                    System.out.println("Anda berhak mengambil 18 SKS");
                } else {
                    if (indeksPrestasi >= 1.50 && indeksPrestasi < 2.00) {
                        System.out.println("Anda berhak mengambil 15 SKS");
                    } else {
                        System.out.println("Anda berhak mengambil < 12 SKS");
                    }
                }
            }
        }
    }
}

