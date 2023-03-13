import java.util.Scanner;

public class dayOfTheWeek {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int tahun, bulan, tanggal, h;
        System.out.print("Masukkan tahun : (contoh : 2012): ");
        tahun = scanner.nextInt();
        System.out.print("Masukkan bulan : 1-12: ");
        bulan = scanner.nextInt();

        if(bulan == 1){
            bulan = 13;
            tahun -= 1;
        }
        else if(bulan == 2){
            bulan = 14;
            tahun -= 1;
        }
        else bulan += 0; tahun +=0;

        System.out.printf("Masukkan tanggal dalam bulan : 1-%d: ", jmlHariDlm1Bulan(bulan, tahun));
        tanggal = scanner.nextInt();

        h = (tanggal + (26*(bulan + 1)/10) + (tahun % 100) + ((tahun % 100)/4) + ((tahun/100)/4) + 5*(tahun/100))%7;

        System.out.printf("\nHari pada bulan tersebut adalah hari %s", angkaKeHari(h));
    }
    public static String angkaKeHari(int angka){
        String hari = " ";
        switch(angka){
            case 0: hari = "Sabtu"; break;
            case 1: hari = "Minggu"; break;
            case 2: hari = "Senin"; break;
            case 3: hari = "Selasa"; break;
            case 4: hari = "Rabu"; break;
            case 5: hari = "Kamis"; break;
            case 6: hari = "Jumat"; break;
        }
        return hari;
    }
    public static int jmlHariDlm1Bulan(int angka, int tahun){
        int jumlahHari = 0;
        switch (angka) {
            case 3: jumlahHari = 31; break;
            case 4: jumlahHari = 30; break;
            case 5: jumlahHari = 31; break;
            case 6: jumlahHari = 30; break;
            case 7: jumlahHari = 31; break;
            case 8: jumlahHari = 31; break; 
            case 9: jumlahHari = 30; break;
            case 10: jumlahHari = 31; break;
            case 11: jumlahHari = 30; break;
            case 12: jumlahHari = 31; break;
            case 13: jumlahHari = 31; break;
            case 14: {
                if (tahun % 4 == 0) {
                    jumlahHari = 29;
                }
                else jumlahHari = 28;
            }break;
        }
        return jumlahHari;
    }
}