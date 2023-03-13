import java.util.Scanner;

public class permuKombi {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int pil;
        do {
        System.out.println("Program Penghitung Kombinasi dan Permutasi");
        System.out.println("1. Menghitung Permutasi");
        System.out.println("2. Menghitung Kombinasi");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        pil = input.nextInt();

            switch (pil) {
                case 1 : {
                    permutasi();
                    break;
                }
                case 2 : {
                    kombinasi();
                    break;
                }
            }
        } while (pil != 3);
    }

    public static int faktorial(int nilai) {
        for (int x = nilai-1; x>0; x--) {
            nilai = nilai * x;
        }
        return nilai;
    }

    public static void permutasi() {

        System.out.print("Masukkan nilai n : ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai r : ");
        int r = input.nextInt();

        int hasil = faktorial(n) / faktorial(n-r);

        System.out.println("\t  n!");
        System.out.println("nPr = --------- = " +hasil);
        System.out.println("\t(n-r)!");
        System.out.println("Maka Hasil Permutasinya adalah : "+hasil);
        System.out.println();
    }

    public static void kombinasi() {

        System.out.print("Masukkan nilai n : ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai r : ");
        int r = input.nextInt();

        int hasil = faktorial(n) / (faktorial(n-r) * faktorial(r));

        System.out.println("\t   n!");
        System.out.println("nCr = --------------- = " +hasil);
        System.out.println("\t(n-r)! x r!");
        System.out.println("Maka Hasil Kombinasinya adalah : "+hasil);
        System.out.println();
    }
}