import java.util.Scanner;
public class array710 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double[] angka = new double[10];

        System.out.print("Masukkan 10 angka: ");
        for (int a = 0; a < angka.length; a++) 
            angka[a] = input.nextDouble();

        System.out.println("Angka yang terkecil adalah: " + angka[indexOfSmallestElement(angka)] + " indeks ke-" + indexOfSmallestElement(angka));
    }

    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1)
            return 0;

        double min = array[0];
        int minimumIndeks = 0;
        for (int a = 1; a < array.length; a++) {
            if (array[a] < min) {
                min = array[a];
                minimumIndeks = a;
            }
        }
        return minimumIndeks;
    }
}
