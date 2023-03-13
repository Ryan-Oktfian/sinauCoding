import java.util.Scanner;

public class array313_n018 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final int max_data = 7;
        int data[][] = new int [6][7];

        System.out.println("Masukkan data arraynya");


        //isConsecutiveFour(max_data);
    }
    public static boolean isConsecutiveFour(int[][] values){
        boolean hasil = false;
        int bil4;

        //cek posisi horizontal
        for(int i=0; i<values.length; i++){
            for(int j=0; j<values[0].length-3; j++){
                bil4 = values[i][j];
                if((values[i][j+1] == bil4) && (values[i][j+2] == bil4) && (values[i][j+3] == bil4))
                hasil = true;
                System.out.println("Terdapat pada baris ke-" +(i+1));
            }
        }

        for(int i=0; i<values.length; i++){
            for(int j=0; j<values[0].length-3; j++){
                bil4 = values[i][j];
                int penghitung = 1;
                for(int k=1; k<4; k++){
                    if((values[i][j+1]) == bil4){

                    }
                }
                if((values[i][j+1] == bil4) && (values[i][j+2] == bil4) && (values[i][j+3] == bil4))
                hasil = true;
                System.out.println("Terdapat pada baris ke-" +(i+1));
            }
        }

        //cek posisi vertikal
        for(int i=0; i<values[0].length; i++){
            for(int j=0; j<values.length-3; j++){
                bil4 = values[i][j];
                if((values[j+1][i] == bil4) && (values[j+2][i] == bil4) && (values[j+3][i] == bil4))
                hasil = true;
                System.out.println("Terdapat pada kolom ke-" +(i+1));
            }
        }

        //cek diagonal ke kanan
        for(int i=0; i<values.length-3; i++){
            for(int j=0; j<values[0].length-3; j++){
                bil4 = values[i][j];
                if((values[i+1][j+1] == bil4) && (values[i+2][j+2] == bil4) && (values[i+3][j+3] == bil4))
                hasil = true;
                System.out.println("Terdapat pada diagonal ke-" +(i+1));
            }
        }

        //cek diagonal ke kiri
        for(int i=0; i<values.length-3; i++){
            for(int j=3; j<values[0].length; j++){
                bil4 = values[i][j];
                if((values[i+1][j-1] == bil4) && (values[i+2][j-2] == bil4) && (values[i+3][j-3] == bil4))
                hasil = true;
                System.out.println("Terdapat pada kolom ke-" +(i+1));
            }
        }
        return hasil;
    }
    
}
