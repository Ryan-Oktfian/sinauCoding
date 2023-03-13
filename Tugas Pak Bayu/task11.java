import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birth, death, immigrant, years, seconds, futurep;
        int currentPopulation = 312032486;
        System.out.print("Enter the number of years ");
        years = input.nextInt();
        seconds = years * 365 * 24 * 3600;
        birth = seconds / 7;
        death = seconds / 13;
        immigrant = seconds / 45;
        futurep = currentPopulation + birth + immigrant - death;
        System.out.println("The population in " + years + " is " + futurep);
        input.close();

    
    }
    
}
