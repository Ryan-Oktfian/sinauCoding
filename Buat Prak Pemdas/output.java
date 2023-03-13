public class output {
    public static void main(String[] args) {
        //Header
        System.out.println("=================");
        System.out.println("Biodata Mahasiswa");
        System.out.println("=================");
        System.out.println();

        //Variabel
        String nama, asalkota, jurusan, asalsekolah, fakultas;
        int umur, tahunangkatan;
        nama = "Ryan Nabris Oktfian";
        asalkota = "Semarang";
        fakultas = "Fakultas Ilmu Komputer";
        jurusan = "Teknologi Informasi";
        asalsekolah = "SMAN 2 Semarang";
        umur = 18;
        tahunangkatan = 2022;

        //Isi
        System.out.println("Nama            : " +nama);
        System.out.println("Umur            : " +umur);
        System.out.println("Asal kota       : " +asalkota);
        System.out.println("Fakultas        : " +fakultas);
        System.out.println("Prodi           : " +jurusan);
        System.out.println("Tahun Angkatan  : " +tahunangkatan);
        System.out.println("Asal Sekolah    : " +asalsekolah);

    }
}