import java.util.Scanner;

public class numberYears {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        int bulanBerapa, tahun;
        int hari_dalamBulan = 0;
        String bulan = "Tidak tersedia";

        System.out.println("====== Program Sederhana Mengetahui Jumlah Hari dalam Bulan di Dalam Tahun ======");
        System.out.println();

        System.out.println("Bulan ke berapa?");
        bulanBerapa = input.nextInt();

       // System.out.println("Tahun berapa?");
        //tahun = input.nextInt();

        if (bulanBerapa >=13)
            System.out.println("Tidak tersedia");
        else { 
            System.out.println("Tahun berapa?");
            tahun = input.nextInt();

        switch (bulanBerapa) {
            case 1:
                bulan = "Januari";
                hari_dalamBulan = 31;
                break;

            case 2:
                bulan = "Fabruari";
                if (tahun%4==0){
                    hari_dalamBulan = 29;
                }
                else {
                    hari_dalamBulan = 28;
                }
                break;

            case 3:
                bulan = "Maret";
                hari_dalamBulan = 31;
                break; 

            case 4:
                bulan = "April";
                hari_dalamBulan = 30;
                break;

            case 5:
                bulan = "Mei";
                hari_dalamBulan = 31;
                break;

            case 6:
                bulan = "Juni";
                hari_dalamBulan = 30;
                break;

            case 7:
                bulan = "Juli";
                hari_dalamBulan = 31;
                break;

            case 8:
                bulan = "Agustus";
                hari_dalamBulan = 31;
                break;

            case 9:
                bulan = "September";
                hari_dalamBulan = 30;
                break;

            case 10:
                bulan = "Oktober";
                hari_dalamBulan = 31;
                break;

            case 11:
                bulan = "November";
                hari_dalamBulan = 30;
                break;

            case 12:
                bulan = "Desember";
                hari_dalamBulan = 31;
                break;
            }
            
            System.out.println("Bulan " +bulan +" " +tahun +" Memiliki " +hari_dalamBulan +" Hari");
        }
        // if(bulanBerapa >= 13){
        //     System.out.println("Bulan tidak tersedia");
        // }
        // else System.out.println("Bulan " +bulan +" " +tahun +" Memiliki " +hari_dalamBulan +" Hari");
    }
}