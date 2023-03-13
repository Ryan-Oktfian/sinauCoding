import java.util.Scanner;

public class arrayno1 {
private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        int[] data = new int[100];

        do {
            System.out.println("1. Input data");
            System.out.println("2. Lihat data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();

            switch(pilihan) {
                case 1 : {
                   data = userInput();
                   System.out.println();
                   break;
                }
                case 2 : {
                    lihatData(data);
                    System.out.println();
                    break;
                }
                case 3 : {
                    System.out.println("Rata-rata dari semua data adalah : " +(double)jumlah(data)/data.length);
                    System.out.println();
                    break;
                }
                case 4 : {
                    System.out.println("Jumlah dari semua data adalah : " +jumlah(data));
                    System.out.println();
                    break;
                }
                case 5 : {
                    maxMin(data, "Maksimal");
                    System.out.println();
                    break;
                }
                case 6 : {
                    maxMin(data, "Minimal");
                    System.out.println();
                    break;
                }
            }
        } while (pilihan != 7);
        System.out.println("Program berhenti");
    }
    public static int[] userInput(){
        System.out.print("Berapa data yang akan disimpan? : ");
        int[] data = new int[input.nextInt()];

        System.out.print("Inputkan data Anda (dalam integer) : ");
        for(int i = 0; i < data.length; i++){
            data[i] = input.nextInt();
        }
        return data;
    }
    public static void lihatData(int[] array){
        System.out.print("Data diinputkan : ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }
    public static int jumlah(int[] array){
        int x = 0;
        for(int i = 0; i < array.length; i++){
            x += array[i];
        }
        return x;
    }
    public static void maxMin(int[] array, String pilihan){
        if(pilihan.equalsIgnoreCase("Minimal")) {
            int minimal = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] < minimal) minimal = array[i];
            }
            System.out.println("Nilai minimal pada data tersebut adalah : " +minimal);
        }
        else if(pilihan.equalsIgnoreCase("Maksimal")) {
            int maksimal = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] > maksimal) maksimal = array[i];
            }
            System.out.println("Nilai maksimal pada data tersebut adalah : " +maksimal);
        }
    }
}
