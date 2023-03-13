import java.util.Scanner;

public class maxCount {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    
    /*(Kemunculan bilangan maksimal) 
    Tulis program yang membaca integer, menemukan mana yang terbesar, 
    dan menghitung kemunculannya. Asumsikan bahwa input diakhiri dengan angka 0.
    Misalkan Anda memasukkan 3 5 2 5 5 5 0; program menemukan bahwa yang terbesar
    adalah 5 dan jumlah kemunculan untuk 5 adalah 4. */

        int angka;
        int maks = 0;
        int modus = 0;

        System.out.print("Enter numbers : ");
        do {
            angka = input.nextInt();
            if (angka > maks) {
                maks = angka;
                modus = 1;
            }
            else if (angka == maks) {
                modus++;
            }
        
        } while (angka != 0);
            System.out.println("The largest number is : " +maks);
            System.out.println("The occurence count of the largest number is : " +modus);
    }
}
    

