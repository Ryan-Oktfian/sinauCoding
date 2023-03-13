//klo mau input wajib ketik import(bwt scanner)
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //pilih tipe data pgn int/double/dsb
        //trs masukin variabel
        double x,y;

        //trs ketik scanner input kyk dibawah (wajib + kapital)
        //"input" bebas mau diketik apa aja
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan operator pertama");
        //untuk "next" tergantung kita pake double/int/dsb
        x = input.nextDouble();
        System.out.println("Masukkan operator kedua");
        y = input.nextDouble();
        System.out.println();

        double penjumlahan = x+y;
        double pengurangan = x-y;
        double perkalian = x*y;
        double pembagian = x/y;

        System.out.println("Hasil penjumlahan : " + (x+y));
        System.out.println("Hasil penumlahan : " +penjumlahan);
        //setelah petik 2 klo mau input x+y wajib pake kurung lagi
        System.out.println("Hasil pengurangan : " + pengurangan);
        //atau bisa pakai cara diatas
        System.out.println("Hasil perkalian : " + (x*y));
        System.out.println("Hasil perkalian : " +perkalian);
        System.out.printf("hasil pebagian %.2f", pembagian );
        input.close();

    }
    
}
