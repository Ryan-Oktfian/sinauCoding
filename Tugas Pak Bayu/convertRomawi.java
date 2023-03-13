import java.util.Scanner;

public class convertRomawi {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    int desimal;

    System.out.print("Masukkan bilangan desimal : ");
    desimal = input.nextInt();

    if (desimal<1 || desimal>3999){
        System.out.println("Maaf, bilangan desimal harus dalam range 1-3999");
    } else {
        while (desimal>=1000) {
            System.out.print("M");
            desimal = desimal - 1000;
        }
        if (desimal>=500) {
            if (desimal>=900){
                System.out.print("CM");
                desimal = desimal - 900;
            } else {
                System.out.print("D");
                desimal = desimal - 500;
            }
        }
        while (desimal>=100) {
            if (desimal>=400) {
                System.out.print("CD");
                desimal = desimal - 400;
            } else {
                System.out.print("C");
                desimal = desimal - 100;
            }
        }
        if (desimal>=50) {
            if (desimal>=90) {
                System.out.print("XC");
                desimal = desimal - 90;
            } else {
                System.out.print("L");
                desimal = desimal - 50;
            }
        }
        while (desimal>=10) {
            if (desimal>=40) {
                System.out.print("XL");
                desimal = desimal - 40;
            } else {
                System.out.print("X");
                desimal = desimal - 10;
            }
        }
        if (desimal>=5) {
            if (desimal>=9) {
                System.out.print("IX");
                desimal = desimal - 9;
            } else {
                System.out.print("V");
                desimal = desimal -5;
            }
        }
        while (desimal>=1) {
            if (desimal>=4) {
                System.out.print("IV");
                desimal = desimal - 4;
            } else {
                System.out.print("I");
                desimal = desimal - 1;
            }
        }
    }
    }
}
