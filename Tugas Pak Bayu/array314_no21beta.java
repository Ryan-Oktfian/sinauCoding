import java.util.Scanner;

public class array314_no21beta {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int num_city; 
        double[][] locations;  

        System.out.print("Enter the number of cities: ");
        num_city = input.nextInt(); 
        locations = new double [num_city][2];       

        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = input.nextDouble(); 
            }
        }
        getCentral(locations);
    }
    public static void getCentral(double[][] array) {

        double totalDistance = 0; 
        int position = 0; 
        double cityDistance; 

        for(int i=0; i<array.length; i++) {
            cityDistance = 0; 
            for (int j = 0; j < array.length; j++) {
                cityDistance = Math.sqrt(Math.pow((array[j][0] - array[i][0]),2) + Math.pow((array[j][1] - array[i][1]),2));   
            }
            if ((i==0 || totalDistance > cityDistance)) {
                totalDistance = cityDistance;
                position = i; 
            }
        }
        System.out.println("The central city is at (" +array[position][0] +", " +array[position][1] +")");
        System.out.println("The total distance to all other cities is " +totalDistance );
    }
}
