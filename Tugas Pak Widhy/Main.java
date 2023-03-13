//domain 
class Car{
    //ketika menggunakan objek, pembeda dari kelas yang lain
    public String noPol = "";
    public int power = 100;
    public int seat = 4;
    public String namaMobil;

    //Constructor = kelas yang akan selalu dipanggil pertama kali(default) pada saat obj dibuat
    //fungsi consturctor = namanya sama dgn nama kelas
    public Car(String nomor_polisi, String car_name, int seat_capacity){  //--> bisa diberi macam2 variabel input
        this.noPol = nomor_polisi;  //--> 'this' merujuk pada sesuatu yang ada di kelas sendiri, bisa atribut bisa method
        this.seat = seat_capacity;
        this.namaMobil = car_name;
        System.out.println("Berhasil membuat " +this.namaMobil +" dengan no pol : " +this.noPol +" dengan kapasitas " +this.seat);
        //'penyederhaan'/ 'enkapsulasi' --> 
    }

    //behaviour
    public void maju(){
        System.out.println(this.noPol +"Bergerak maju");        
    }

    public void mundur(){
        System.out.println(this.noPol +"Bergerak mundur");
    }
}
class PetrolCar extends Car{
    public int kapasitasBBM = 50;
    public int isiTangkiBBM = 0;

    public PetrolCar(String noPol, String namaMobil, int seat, int isiTangkiBBM){
        super(noPol, namaMobil, seat);
        this.isiTangkiBBM = isiTangkiBBM;
    }

    public void isiBBM(int beliBerapa){
        this.isiTangkiBBM += beliBerapa;
        System.out.printf("Berhasil membeli bensin untuk %s sebanyak %d liter! Isi tangki sekarang %d liter\n", namaMobil, beliBerapa, isiTangkiBBM);
    }
}

class ElectricCar extends Car{
    public int dayaListrik = 200;
    public int sisaEnergiListrik = 0;

    public ElectricCar(String noPol, String namaMobil, int seat, int sisaEnergiListrik){
        super(noPol, namaMobil, seat);
        this.sisaEnergiListrik += sisaEnergiListrik;
    }

    public void isiKwh(int beliBerapa){
        this.sisaEnergiListrik = beliBerapa;
        System.out.printf("Berhasil mengisi Kwh untuk %s sebanyak %d Kwh! Total Kwh sekarang %d\n", namaMobil, beliBerapa, sisaEnergiListrik);
    }
}

public class Main {
    public static void main(String[] args) {
        //membuat objek dari kelas car
        Car angkot1 = new Car("N 123 GG", "Angkot", 12); // --> di create spt yang di cons
        //System.out.println("Berhasil membuat angkot angkot dengan no pol : " +angkot1.noPol +" dengan kapasitas " +angkot1.seat);
        angkot1.maju();
        angkot1.mundur();

        /*System.out.println(angkot1.power);
        System.out.println(angkot1.seat);*/

        Car angkot2 = new Car("N 456 SM", "Angkot", 2);
        //System.out.println("Berhasil membuat angkot angkot dengan no pol : " +angkot2.noPol +" dengan kapasitas " +angkot2.seat);
        angkot2.maju();
        angkot2.mundur();

        PetrolCar mobil1 = new PetrolCar("H 41 CWE", "Brio", 4, 50);
        mobil1.isiBBM(25);
        mobil1.maju();

        ElectricCar mobil2 = new ElectricCar("H 41 JG", "Wuling Air EV", 4, 80);
        mobil2.isiKwh(20);
        mobil2.mundur();


    }
    
}
/*
//domain 
class Car{
    //Constructor = kelas yang akan selalu dipanggil pertama kali(default) pada saat obj dibuat ketika menggunakan objek, pembeda dari kelas yang lain
    public String noPol = "";
    public int power = 100;
    public int seat = 4;

    //fungsi consturctor = namanya sama dgn nama kelas
    /*public Car(String nomor_polisi, int seat_capacity){  //--> bisa diberi macam2 variabel input
        this.noPol = nomor_polisi;  //--> 'this' merujuk pada sesuatu yang ada di kelas sendiri, bisa atribut bisa method
        this.seat = seat_capacity;
        System.out.println("Berhasil membuat angkot angkot dengan no pol : " +this.noPol +" dengan kapasitas " +this.seat);
        //'penyederhaan'/ 'enkapsulasi' --> 
    }

    //behaviour
    public void maju(){
        System.out.println(this.noPol +" Bergerak maju");        
    }

    public void mundur(){
        System.out.println(this.noPol +" Bergerak mundur");
    }
}
class PetrolCar extends Car{
    public int kapasitasBBM = 50;
    public int isiTangkiBBM = 0;

    public void isiBBM(int beliBerapa){
         this.isiTangkiBBM = beliBerapa;
    }
}

class ElectricCar extends Car{
    public int dayaListrik = 200;
    public int sisaEnergiListrik = 0;

    public void isiKwh(int beliBerapa){
        this.sisaEnergiListrik = beliBerapa;
    }
}

public class OOPManeh {
    public static void main(String[] args) {
        //membuat objek dari kelas car
        Car angkot1 = new Car(); // --> di create spt yang di cons
        angkot1.noPol = "N 123 GG"; //parameter constructor e dihapus, diganti iki variable e
        angkot1.seat = 12; //podo keterangane kayak sing duwur
        System.out.println("Berhasil membuat angkot angkot dengan no pol : " +angkot1.noPol +" dengan kapasitas " +angkot1.seat);
        angkot1.maju();
        angkot1.mundur();

        /*System.out.println(angkot1.power);
        System.out.println(angkot1.seat);

        Car angkot2 = new Car();
        angkot2.noPol = "N 456 SM"; //podo kayak sing angkot 1
        angkot2.seat = 2; //podo
        System.out.println("Berhasil membuat angkot angkot dengan no pol : " +angkot2.noPol +" dengan kapasitas " +angkot2.seat);
        angkot2.maju();
        angkot2.mundur();


    }
    
}*/