import java.util.Scanner;

class bangunDatar{
    public int panjang = 0;
    public int lebar = 0;
    public int jarijari;

    public bangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public bangunDatar(int sameSize){
        panjang = sameSize;
        lebar = sameSize;
    }


    public double hitungLuas(){
        return panjang*lebar;
    }
    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }
}

class lingkaran extends bangunDatar{
    // public int jarijari;

    public lingkaran(int jarijari){
        super(jarijari);
    }
    public double hitungLuas() {
        return Math.PI * panjang * panjang;
        
    }
    public double hitungKeliling(){
        return Math.PI * panjang * 2;
    }
}

class SegiEmpat extends bangunDatar{
    public SegiEmpat(int panjang, int lebar){
        super(panjang, lebar);
    }
    public SegiEmpat(int samaSisi){
        super(samaSisi);
    }

    @Override
    public double hitungKeliling() {
        return super.hitungKeliling();
    }
    @Override
    public double hitungLuas() {
        return super.hitungLuas();
    }

    public void cariDiagonal(){
        System.out.println("Panjang diagonal segi empat tersebut: "+Math.sqrt(Math.pow(panjang, 2)+Math.pow(lebar, 2)));
    }
}
public class luasLingkaran {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
      
        System.out.print("Masukkan jari-jari :");
        int jari = input.nextInt();

        lingkaran lingkaran1 = new lingkaran(jari);
        System.out.println("Hasil dari luas lingkaran tersebut adalah : " +lingkaran1.hitungLuas());
        System.out.println("Hasil dari keliling lingkaran tersebut adalah : " +lingkaran1.hitungKeliling());
        
        System.out.print("Masukkan panjang dan lebar: ");
        SegiEmpat persegiPanjang1 = new SegiEmpat(input.nextInt(), input.nextInt());
        System.out.println("Luas persegi panjang : "+persegiPanjang1.hitungLuas());
        System.out.println("Keliling persegi panjang : "+persegiPanjang1.hitungKeliling());
        persegiPanjang1.cariDiagonal();

        System.out.print("Masukkan panjang sisi: ");
        SegiEmpat persegi1 = new SegiEmpat(input.nextInt());
        System.out.println("Luas persegi : "+persegi1.hitungLuas());
        System.out.println("Keliling persegi : "+persegi1.hitungKeliling());
        persegi1.cariDiagonal();
    }
}



/*penulisan cons yg tepat adalah void, dan namanya sama dengan nama kelas
 * slide 7 adl salah satu overloading
 * cons --> tidak ada return type
 * 
 */