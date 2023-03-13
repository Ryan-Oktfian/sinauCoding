import java.util.Scanner;

public class method239_no21 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter a string: ");
		String num = input.nextLine();
		
		for (int i = 0; i < num.length(); i++) {
			if (Character.isLetter(num.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(num.charAt(i))));
			else
				System.out.print(num.charAt(i));
		}
		System.out.println();
	}
	
	public static int getNumber(char uppercaseLetter) {

		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;
	} 
}
