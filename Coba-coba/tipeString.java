import java.lang.String; //idealnya library String pake ini
// default pjg String = 255

public class tipeString {
    public static void main(String[] args) {
        char[] nama = {'c','o','n','t','o','h'};
        char[] nama2 = new char[15];
        nama2[0] = 'a';
        nama2[1] = 'b';
        //dsb
        System.out.println(nama);
        System.out.println(nama2[1]);

        //maka, dibuatlah tipe String :
        String nama3 = "Contoh";
        System.out.println(nama3);
        //untuk String tdpt byk metode
        System.out.println(nama3.charAt(3));
    }
}
