//import java.util.Scanner;

/*public class segiempat {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Program menghitung luas, keliling, dan panjang diagonal segi empat");
        System.out.println();
        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = input.nextInt();
        System.out.println();

        int keliling = panjang + lebar + panjang + lebar;
        int luas = panjang * lebar;
        double diagonal = Math.sqrt(Math.pow(panjang,2)+Math.pow(lebar,2));

        System.out.println("Luas segi empat tersebut adalah : " +luas);
        System.out.println("Keliling segi empat tersebut adalah : " +keliling);
        System.out.println("Panjang diagonal segi empat tersebut adalah : " +diagonal);
    }
    
}*/

abstract class bangunRuang {
    public double keliling;
    public double luas;
    public String namaBangun;

    abstract void hitungLuas();

    public double getLuas() {
        return luas;
    }

    public void setNamaBangun(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public String getNamaBangun() {
        return namaBangun;
    }
}

class lingkaran extends bangunRuang { // --> ini gabisa di run 
    double jari;
    double diameter;

    public lingkaran() {
        System.out.println("Objek dengan tipe lingkaran terbentuk");
    }
    //constructor overloading
    public lingkaran(String nama) {
        this.setNamaBangun(nama);
        System.out.println("Objek dengan tipe lingkaran terbentuk");
        System.out.println(this.getNamaBangun());
    }

    @Override
    public void hitungLuas() {
        this.luas = 3.14 * jari * jari;
    }

    public void setJari(double jari) {
        this.jari =jari;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

public class materi1 {
    public static void main(String[] args) {
        lingkaran l1 = new lingkaran();
        lingkaran l2 = new lingkaran("Roda");

        l1.setJari(10);
        l1.hitungLuas();
        System.out.println(l1.getLuas());

        l2.setJari(100);
        l2.hitungLuas();
        System.out.println(l2.getLuas());
    }
}
