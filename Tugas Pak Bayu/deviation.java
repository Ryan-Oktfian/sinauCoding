import java.util.Scanner;

public class deviation {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
        numbers[i] = input.nextDouble();

        System.out.printf("The mean is: %.2f \n ", mean(numbers));
        System.out.printf("The standard deviation is: %.5f", deviasi(numbers));
    }

    public static double deviasi(double[] x) {
        double mean = mean(x);
        double deviasi = 0;
        double hasil;
        for (int i = 0; i < x.length; i++) {
            deviasi += Math.pow((x[i] - mean), 2);
        }
        hasil = Math.sqrt(deviasi / (x.length - 1));
        return hasil; 
    }

    public static double mean(double[] x) {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }
}
