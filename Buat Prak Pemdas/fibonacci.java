import java.util.Scanner;

public class fibonacci {
    
	// Function to print N Fibonacci Number
	public static void fibonacci(int x) {

		int angka1 = 0, angka2 = 1;
		int pertambahan = 0;

		// Iterate till counter is N
		while (pertambahan < x) {

			// Print the number if you want to display 0 at first
            // System.out.print(angka1 + " ");

			// Swap
			int angka3 = angka2 + angka1;
			angka1 = angka2;
			angka2 = angka3;
			pertambahan = pertambahan + 1;

            // Print the number if you want to display 1 at first
            System.out.print(angka1 + " ");
		}
	}

	// Driver Code
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		// Given Number N
        System.out.println("Berapa deret fibonacci? : ");
		int deret = input.nextInt();

		// Function Call
		//
		fibonacci(deret);

        input.close();
	}
}


    

