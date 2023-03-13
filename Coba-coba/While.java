import java.util.Scanner;
public class While {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    
    System.out.println("Program mencari bilangan prima atau bukan");
    System.out.println("Masukkan bilangan : ");
    int bil = input.nextInt();

    int ulang;
    boolean prima = true;
    int sisa = 0;

    for (ulang=2; ulang<(bil-1); ulang++){
        sisa = bil%ulang;
        if (sisa == 0){
            prima =  false;
            break;
        }
    }

    if (prima)
    System.out.println("prima");
    else
    System.out.println();







        
    //     boolean keluar = false;
    //     int jumlah = 0;
    //     Scanner input = new Scanner(System.in);



    //     while (keluar){
    //         System.out.println("Program yang selalu berputar");

    //         String data = input.next();
    //         char huruf = 
    //     }
    }
    
}
