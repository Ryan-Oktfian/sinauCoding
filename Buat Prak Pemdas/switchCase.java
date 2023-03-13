import java.util.Scanner;
public class switchCase {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        System.out.println("Main menu : ");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.println();
        System.out.println("Mau menghitung apa? ");
        pilihan = input.nextInt();
            switch (pilihan) {
                case 1 : {
                    System.out.println("Masukkan panjang! : ");
                    int panjang = input.nextInt();
                    System.out.println("Masukkan lebar! : ");
                    int lebar = input.nextInt();
                    System.out.println();
                    System.out.println("Luas persegi panjang adalah : "+ (panjang*lebar) +" cm2");
                    System.out.println("Keliling persegi panjang adalah : "+ 2*(panjang+lebar) +" cm");
                    break;
                }
                
                case 2 : {
                    System.out.println("Masukkan jari-jari lingkaran! : ");
                    int jari2 = input.nextInt();
                    double luas = Math.PI * Math.pow(jari2, 2);
                    Double keliling = 2 * Math.PI *jari2;
                    System.out.println();
                    System.out.println("Luas lingkaran adalah : "+ (double)luas +" cm2");
                    System.out.println("Keliling lingkarang adalah : "+ (double)keliling +" cm");
                    break;
                }

                case 3 : {
                    System.out.println("Masukkan alas segitiga! : ");
                    int alas = input.nextInt();
                    System.out.println("Masukkkan tinggi segitiga! : ");
                    int tinggi = input.nextInt();
                    double sisiMiring = Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi, 2));
                    System.out.println();
                    System.out.println("Luas segitiga adalah : "+ (0.5 * alas * tinggi) +" cm2");
                    System.out.println("Keliling segitiga adalah : "+ (alas + tinggi + sisiMiring) +" cm");
                    break;
                }
                default : System.out.println("Data tidak ditemukan, program dihentikan ... ");

            }
    }
}
