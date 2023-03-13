import java.util.Scanner;

public class valueCD {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the initial deposit amount : ");
        int deposit = input.nextInt();
        System.out.print("Enter annual percentage yield : ");
        double annualPercent = input.nextDouble();
        System.out.print("Enter maturity period (number of months) : ");
        int month = input.nextInt();
        System.out.println();

        System.out.println("Month\t CD Value");

        double previousDeposit = deposit;

        for (int i = 1; i <= month; i++) {
            double value =  previousDeposit + previousDeposit * annualPercent / 1200;
            previousDeposit = value;

            System.out.printf("%d\t %.2f\n", i, value);
        }

    }
    
}
