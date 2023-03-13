import java.util.Scanner;

public class array309_no11 {
    private static final Scanner input = new Scanner(System.in);

    public static int[] desimalKeBiner(int desimal) {

        int[] nums = new int[9];

        for(int i = nums.length-1; i>=0 && desimal >0; i--) {
            if(desimal%2 == 0) {
                nums[i] = 0;
            }
            else {
                nums[i] = 1;
                desimal /= 2;
            }
        }
        return nums;
    }
    public static void munculHeadOrTail(int[] nums) {

        for(int i=0; i<9; i++) {
            if(nums[i] == 0) {
                System.out.print("H ");
            }
            else {
                System.out.print("T ");
            }
            if ((i+1) % 3 == 0){ 
                System.out.println();
            }
        }
    }
    public static void main (String[] args) {

        System.out.print("Enter a number between 0 and 511: ");
        int angka = input.nextInt();
        if(angka <0 || angka >511) {
            System.out.println("error");
        }
        else {
            int[] nums = desimalKeBiner(angka);
            munculHeadOrTail(nums);
        }
    }
}


    
