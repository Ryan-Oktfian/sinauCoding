/**
 * pr 1
 */

import java.util.Scanner;

public class project1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        System.out.println("masukkan panjang: ");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar: ");
        lebar = input.nextInt();
        
        luas = panjang*lebar;
        System.out.printf("Maka luas bangun datar adalah %d\n ", luas);

        input.close();
        
    }
}