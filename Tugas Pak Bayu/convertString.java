import java.util.Scanner;

public class convertString {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    long desimal;
    
    System.out.println("Masukkan angka desimal : ");
    desimal = input.nextInt();

    if (desimal > 0){
        convert(desimal);
    }
    else {
        System.out.print("Negatif ");
        convert(Math.abs(desimal));
    }
    }

public static void convert(long desimal){
    if (desimal == 1) System.out.print("Satu"); 
    else if (desimal == 2) System.out.print("Dua");
    else if (desimal == 3) System.out.print("Tiga");
    else if (desimal == 4) System.out.print("Empat");
    else if (desimal == 5) System.out.print("Lima");
    else if (desimal == 6) System.out.print("Enam");
    else if (desimal == 7) System.out.print("Tujuh");
    else if (desimal == 8) System.out.print("Delapan");
    else if (desimal == 9) System.out.print("Sembilan");
    else if (desimal == 10) System.out.print("Sepuluh");
    else if (desimal == 11) System.out.print("Sebelas");
    else if (desimal <= 19) {
        convert(desimal%10);
        System.out.print(" Belas ");
    }
    else if (desimal <= 99){
        convert(desimal/10);
        System.out.print(" Puluh ");
        convert(desimal%10);
    }
    else if (desimal <= 199){
        System.out.print("Seratus ");
        convert(desimal%100);
    }
    else if (desimal <= 999){
        convert(desimal/100);
        System.out.print(" Ratus ");
        convert(desimal%100);
    }
    else if (desimal <= 1999){
        System.out.print("Seribu ");
        convert(desimal%1000);
    }
    else if (desimal <= 999999){
        convert(desimal/1000);
        System.out.print(" Ribu ");
        convert(desimal%1000);
    }
    else if (desimal <= 999999999){
        convert(desimal/1000000);
        System.out.print(" Juta ");
        convert(desimal%1000000);
    }
    else if (desimal <= 999999999999L){
        convert(desimal/1000000000);
        System.out.print(" Milyar ");
    }
    else if (desimal <= 999999999999999L){
        convert(desimal/1000000000000L);
        System.out.print(" Triliun ");
        convert(desimal%1000000000000L);
    }
    else 
        System.out.println("Tidak terdefinisi");
    }
}