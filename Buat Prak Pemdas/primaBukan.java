import java.util.Scanner;

public class primaBukan {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan prima : ");
        int bil = input.nextInt();
        primaAtauBukan(bil);

        System.out.println("program menentukan bilangan prima 1-100");
        System.out.println("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97");
    }
    
    public static void primaAtauBukan(int bil) {
    
        if (bil == 0 || bil == 1) {
            System.out.println("error");
        }
        else {
            for (int i=2; i<=bil/2;) {
                if (bil%i == 0) {
                    System.out.println("bilangan " +bil +" termasuk bukan bilangan prima");
                    break;
                }
                else {
                    System.out.println("bilangan " +bil +" termasuk bilangan prima");
                    break;
                }
            }
        }
    }
}
