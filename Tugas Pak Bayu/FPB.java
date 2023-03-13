import java.util.Scanner;

public class FPB {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int fpb, angka1, angka2, bilBesar, bilKecil;

    System.out.println("=== Program menghitung Faktor Persekutuan Terbesar (FPB) ===");
    System.out.println();
    System.out.print("Masukkan angka pertama : ");
    angka1 = input.nextInt();
    System.out.print("Masukkan angka kedua : ");
    angka2 = input.nextInt();
    System.out.println();

    if (angka1 > angka2) {
        bilBesar = angka1;
        bilKecil = angka2;
      }
      else {
        bilBesar = angka2;
        bilKecil = angka1;
      }
    
    int nilai = bilKecil;
    while (nilai > 0){
        if (bilKecil % nilai == 0 && bilBesar % nilai == 0) {
            fpb =  nilai;
            System.out.println("FPB-nya adalah : " +fpb);
            break;
        }
        nilai--;
    }
    input.close();
    }   
}
