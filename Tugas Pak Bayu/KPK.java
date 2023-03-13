import java.util.Scanner;

public class KPK {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int kpk, angka1, angka2, bilBesar, bilKecil;

    System.out.println("=== Program menghitung Kelipatan Persekutuan Terkecil (KPK) ===");
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

    int nilai = 1;
    while (nilai <= bilKecil){
      if ((bilBesar*nilai) % bilKecil == 0){
        kpk = bilBesar*nilai;
        System.out.println("KPK-nya adalah : " +kpk);
        break;
      }
      nilai++;
    }
    input.close(); 
    }
}
