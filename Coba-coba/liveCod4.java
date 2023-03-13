//import java.io.*;
import java.util.*;

public class liveCod4 {
    //soal no 1
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        
        int jml = input.nextInt();
        int pil[] = new int[jml];
        
        for(int x = 0; x < pil.length; x++){
            pil[x] = input.nextInt();
        }
        Arrays.sort(pil);
        System.out.println(pil[1]-pil[0]);
    }

    //soal no 2
    /*private static final Scanner input = new Scanner(System.in);
        public static void main(String[] args){
            int num = input.nextInt();
            hitungDigit(num);
        }

        public static int hitung(int num){
            int digitAkhir, hitung = 0;
            do{
                digitAkhir = num % 10;
                hitung = hitung + digitAkhir;
                num = num/10;
            } while(num != 0); 
        return hitung;
        }
        
        public static void hitungDigit(int num){
            int sum = num;
            while(sum/10 != 0) {
                sum = hitung(sum);
            }
            System.out.println(sum);
        }*/

    //soal no 3
    /*private static final Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            int[][] num = new int [5][5];
            for(int line=0; line<num.length; line++){
                for(int column=0; column<num.length; column++){
                    num[line][column] = input.nextInt();
                }
            }
            
            for(int i=0; i<num.length; i++){
                int sum = 0;
                for(int j=0; j<num[0].length; j++){
                    sum = sum + num[i][j];
                }
                System.out.println("Jumlah row-" +(i+1) +": " +sum);
            }
            System.out.println();

        
            for(int i=0; i<num.length; i++){
                int terbesar = num[i][0];
                for(int j=0; j<num[0].length; j++){
                    if(num[i][j] > terbesar){
                        terbesar = num[i][j];
                    }
                }
                System.out.println("Angka Terbesar row-" +(i+1) +": " +terbesar);
            }
        
        } */
}
