import java.util.Scanner;

public class loans {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    /*(Aplikasi keuangan: bandingkan pinjaman dengan berbagai suku bunga)
    Tulis program yang memungkinkan pengguna memasukkan jumlah pinjaman dan periode pinjaman
    dalam beberapa tahun serta menampilkan pembayaran bulanan dan total untuk setiap suku bunga mulai dari
    5% hingga 8%, dengan kenaikan 1/8 */

        System.out.print("Loan Ammount : ");
        double loan = input.nextInt();
        System.out.print("Number of Years : ");
        int years = input.nextInt();
        System.out.println();

        System.out.println("Interest Rate\t Monthly Payment\tTotal Payment");
		
	    for (double percent = 5.0; percent <= 8.0; percent += 0.125) {
            System.out.printf("%.3f", percent); 
            System.out.print("%\t \t");

		    double interestRate = percent / 1200;
		    double monthlyPayment = loan * interestRate / (1 - 1 / Math.pow(1 + interestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;
        
            System.out.printf(" %.2f\t \t \t", monthlyPayment);
            System.out.printf("%.2f\n", totalPayment);
		}
        
    }
    
}
