public class splitString {
    public static void main(String[] args) {
        //Membuat Variable
        String kalimat = "Belajar Pemrograman Java di wildantechnoart.net";
        String noID ="11-3466-9900-3";
 
        //Contoh dari regex,untuk memisahkan spasi
        String[] kata = kalimat.split("\\s");
 
        //Contoh regex, untuk memisahkan tanda -
        String[] bagian = noID.split("-");
 
        //Mengambil nilai berdasarkan index dari pemisahan method split -
        String bagian1 = bagian[0];
        String bagian2 = bagian[1];
        String bagian3 = bagian[2];
        String bagian4 = bagian[3];
 
        //Menampilkan nilai yang dipisahkan berdasarkan spasi
        //Menggunakan for-each
        for(String text :kata){
            System.out.println(text);
        }
 
        //Menampilkan nilai yang di pisahkan dari simbol -
        System.out.println("No ID : "+bagian1+bagian2+bagian3+bagian4);
    }
    
}
