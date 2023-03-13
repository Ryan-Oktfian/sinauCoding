import java.util.Scanner;

public class rumusABC {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        double a, b, c, diskriminan, r1, r2;

        System.out.println("===== Rumus abc sederhana =====");
        System.out.println();
        System.out.print("Masukkan bilangan a, b, dan c : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        System.out.println();

        diskriminan = Math.pow(b, 2)-(4*a*c);
        r1 = (double)(-b + Math.pow(diskriminan, 0.5)) / 2*a;
        r2 = (double)(-b - Math.pow(diskriminan, 0.5)) / 2*a;

        if (diskriminan >0)
            System.out.println("Persamaan tersebut memiliki 2 akar yaitu : " +r1 +" dan " +r2);
        else if (diskriminan == 0)
            System.out.println("Persamaan tersebut memiliki 1 akar yaitu : " +r1);
        else {
            System.out.println("Persamaan tersebut tidak memiliki akar-akar");
        }        
    }
}
