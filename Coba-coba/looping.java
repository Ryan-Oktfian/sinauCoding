//import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
       
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("* ");
                if ((i+j) == 4){
                    break;
                }
            }
            System.out.println();
        }
    }
}