public class VirtualDemo {
    public static void main(String[] args){ 
        System.out.println("Menyusun Pegawai");

        //Bentuk Polimorfisme
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);
        Pegawai c = new Pegawai("Ghina", "Padang", 4);
        Pegawai a = new Pegawai("Anfasha", "Kapalo Koto", 5);
        
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Class Pegawai--");
        c.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Class Pegawai");
        a.mailCheck();
        c.Info();
    }
}
