import java.util.Scanner;

public class kwhmeter {
    private static final Scanner masukan = new Scanner(System.in);
    public static void main(String[] args) {
      int kwhawal, kwhakhir, beban, ppj, bulanini, tarif, persenppj, total;
      String nama, kelurahan;

      System.out.println("=== Program Menghitung Listrik Sederhana ===");
      System.out.print("Masukkan nama : ");
      nama = masukan.nextLine();
      System.out.print("Kelurahan : ");
      kelurahan = masukan.nextLine();
      System.out.print("Masukkan posisi Kwh meter awal Anda : ");
      kwhawal = masukan.nextInt();
      System.out.print("Masukkan posisi Kwh meter akhir Anda : ");
      kwhakhir = masukan.nextInt();
      System.out.print("Masukkan biaya beban saat ini : ");
      beban = masukan.nextInt();
      System.out.print("Masukkan PPJ yang berlaku (dalam persen) : ");
      ppj = masukan.nextInt();
      System.out.println();

      bulanini = kwhakhir-kwhawal;
      tarif = bulanini*beban;
      persenppj = tarif/ppj;
      total = persenppj+tarif;


      System.out.println("==================== PLN JAVA ======================");
      System.out.println("Nama                      : " + nama);
      System.out.println("Kelurahan                 : " + kelurahan);
      System.out.println("Pemakaian bulan saat ini  : " + bulanini + " Kwh meter");
      System.out.println("Tarif Listrik             : Rp" + tarif + ",-");
      System.out.println("PPJ 10%                   : Rp" + persenppj + ",-");
      System.out.println("Total bayar               : Rp" + total + ",-");
      System.out.println("====================================================");




    }    
}
