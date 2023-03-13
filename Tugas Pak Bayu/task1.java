import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {
        double celcius, fahrenheit;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius ");
        celcius = input.nextDouble();
        fahrenheit = ((double)9/5 * celcius) + 32;
        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit  ");
        input.close();
    }
}
