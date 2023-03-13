import java.util.Scanner;
public class pyramidNum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      System.out.print("Baris : ");
      int baris = input.nextInt();

      for (int x = 1; x <= baris; x++) {
        for (int y = 1; y <= x; y++) { // --> loop 2 buat pembatasan. eks : 1 (batasnya 1 trs enter), 2 (batasnya 2 trs enter)
          System.out.print(y +" ");
      }
          System.out.println();
      }

      // lihat bedanya di if
      
      for (int x = 1; x <= baris; x++) {
        for (int y = 1; y <= baris; y++) {
          System.out.print(y +" ");
          if(x==y){
            break;
          }
      }
          System.out.println();
    }
    input.close();
    }
    
}
