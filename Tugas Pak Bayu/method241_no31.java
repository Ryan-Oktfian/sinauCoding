import java.util.Scanner;

public class method241_no31 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a credit card number as a long integer:");
		long num = input.nextLong();

		System.out.println(num + " is " + (isValid(num) ? "valid" : "invalid"));
	}

	public static boolean isValid(long num) {
		boolean valid =
			(getSize(num) >= 13 && getSize(num) <= 16) &&
			(prefixMatched(num, 4) || prefixMatched(num, 5) ||
			prefixMatched(num, 37) || prefixMatched(num, 6)) &&
			((sumOfDoubleEvenPlace(num) + sumOfOddPlace(num)) % 10 == 0);

		return valid;
	}
	
	public static int sumOfDoubleEvenPlace(long num) {
		int sum = 0;
		String bil = num + "";
		for (int i = getSize(num)-2; i>=0; i-=2) {
			sum += getDigit(Integer.parseInt(bil.charAt(i) + "") * 2);
		}
		return sum;
	}
	
	public static int getDigit(int num) {
		if (num < 9)
			return num;
		else
			return num / 10 + num % 10;
	}
	
	public static int sumOfOddPlace(long num) {
		int sum = 0;
		String bil = num + "";
		for (int i = getSize(num)-1; i>=0; i-=2) {
			sum += Integer.parseInt(bil.charAt(i) + "");
		}
		return sum;
	}
	
	public static boolean prefixMatched(long num, int d) {
		return getPrefix(num, getSize(d)) == d;
	}
	
	public static int getSize(long d) {
		String bil = d + "";
		return bil.length();
	}
	
	public static long getPrefix(long num, int k) {
		if (getSize(num) > k)  {
			String bil = num + "";
			return  Long.parseLong(bil.substring(0, k));
		}
		return num;
	}
}
