import java.util.Scanner;

public class arrayno2 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan, jumlah = 0;
        String pesan = "";
        String[][] data = { { "Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada" }, 
                { "Bisnis", "100000", "5%", "Ada", "Tidak Ada"}, 
                {"Eksekutif", "200000", "7%", "Ada", "Tidak Ada" },
                { "Pariwisata", "300000", "10%", "Ada", "Ada" } };
        do {
            System.out.println("Pilihan menu : ");
            System.out.println("1. Melihat Daftar Kereta Api ");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC ");
            System.out.println("3. Melihat Daftar Kereta Api yang ada colokan ");
            System.out.println("4. Memesan Tiket Kereta Api ");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.print("Pilihan Anda : ");
            pilihan = input.nextInt();

            switch(pilihan) {
                case 1: {
                    System.out.println("Daftar Kereta Api: ");
                    for(int i = 0; i < 4; i++){
                        System.out.printf("%d. %s\n", i+1, data[i][0]);
                    }
                    break;
                }
                case 2: {
                    int x = 0;
                    System.out.println("Daftar Kereta Api yang ada AC : ");
                    for(int i = 0; i < 4; i++){
                        if(data[i][3].equalsIgnoreCase("ada")) {
                            x++;
                            System.out.printf("%d. %s\n", x, data[i][0]);
                        }
                    }
                    break;
                }
                case 3: {
                    int x = 0;
                    System.out.println("Daftar Kereta Api yang ada colokan : ");
                    for(int i = 0; i < 4; i++){
                        if(data[i][4].equalsIgnoreCase("ada")) {
                            x++;
                            System.out.printf("%d. %s\n", x, data[i][0]);
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("Jenis kereta api apa yang ingin anda pesan? : ");
                    pesan = input.next();
                    System.out.print("Berapa tiket yang ingin anda pesan? : ");
                    jumlah = input.nextInt();
                    break;
                }
                case 5: {
                    int indexKereta = pesananKereta(pesan, data);
                    System.out.println();
                    System.out.println("PESANAN TIKET ANDA : ");
                    System.out.printf("%-30s: %s\n", "Jenis Kereta", data[indexKereta][0]);
                    System.out.printf("%-30s: %d\n", "Jumlah tiket", jumlah);
                    System.out.printf("%-30s: Rp %,.2f\n", "Harga Satuan", Double.parseDouble(data[indexKereta][1]));
                    System.out.printf("%-30s: %s\n", "Diskon Satuan", data[indexKereta][2]);
                    System.out.printf("%-30s: Rp %,.2f\n", "Total yang harus dibayar", harga(indexKereta, data, jumlah));
                    System.out.println();
                    System.out.println("FASILITAS KERETA : ");
                    System.out.printf("%-15s: %s\n", "AC", data[indexKereta][3]);
                    System.out.printf("%-15s: %s\n", "Colokan", data[indexKereta][4]);
                    break;
                }
            }
        } while (pilihan >=1 && pilihan <= 5);
    }
    public static int pesananKereta(String pesan, String[][] data){
        int indeksKereta = -1;
        for(int i = 0; i < 4; i++){
            if(data[i][0].equalsIgnoreCase(pesan)) 
            indeksKereta = i;
        }
        return indeksKereta;
    }
    public static double harga(int rowKereta, String[][] data, int jumlahPesan){
        int harga = Integer.parseInt(data[rowKereta][1]);
        int diskon = Integer.parseInt(String.valueOf(data[rowKereta][2].substring(0, 2).replace(" ", "")));
        double setelahDiskon = harga - ((diskon/100.0) * harga);
        return setelahDiskon * jumlahPesan;
    }
    
}
