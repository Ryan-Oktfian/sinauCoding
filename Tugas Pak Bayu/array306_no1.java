import java.util.Scanner;

public class array306_no1 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        double[][] array = new double[3][4];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = input.nextDouble();
            }
        }
        for(int j=0; j<array[0].length; j++){
                System.out.println("Sum of the elements at column "+j +" is " +sumColumn(array,j));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double total = 0;
        for(int i=0; i<m.length; i++){
            total += m[i][columnIndex];
        }
        return total;
    } 
}
