import java.util.Scanner;

public class beanMachine {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number of balls to drop: ");
        int numberOfBall = input.nextInt();
        String[] ballPath = new String[numberOfBall];

        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();
        int[] slots = new int[numberOfSlots];

        for (int i = 0; i < numberOfBall; i++) {
            ballPath[i] = dropBall(slots);
            System.out.printf("%10s\n", ballPath[i]);
        }
        System.out.println("");
        printArray(slots, numberOfBall);
    }

    public static String dropBall(int[] slot) {
        String path = "";
        for (int i = 0; i < slot.length - 1; i++) {
            int random = (int)(Math.random() * 10) % 2;
            if (random > 0) path += "R";
            else path += "L";
        }
        int position = BallPosition(path, 'R');
        slot[position]++;
        return path;
    }

    public static int BallPosition(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        
            if (str.charAt(i) == a) count++;
        }
        return count;
    }

    public static void printArray(int[] slots, int numberOfBalls) {
        while (!Empty(slots)) {

            if (RowEmpty(slots, numberOfBalls)) {
               numberOfBalls--;
               continue;
            }
            for (int i = 0; i < slots.length; i++) {

                if (slots[i] >= numberOfBalls) {
                    System.out.printf("%2c", 'O');  
                    slots[i]--;
                }
                else System.out.printf("%2c", ' ');
            }
            numberOfBalls--;
            System.out.println("");
        }
    }

    public static boolean Empty(int[] slots) {
        for (int slot : slots) {
            if (slot != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean RowEmpty(int[] slots, int rowNum) {
        for (int slot : slots) {
            if (slot == rowNum) {
                return false;
            }
        }
        return true;
    }
}