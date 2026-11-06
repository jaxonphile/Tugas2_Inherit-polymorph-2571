package soal2;

/**
 * Kelas utama pengujian polimorfisme, type casting, dan error handling Soal 2.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class TesSoal2 {
    
    /**
     * Method utama untuk mengeksekusi pengujian.
     * 
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat();

        Kucing k = (Kucing)h;
        k.panjat();
        
        Hewan h2 = new Hewan("Generik");
        Kucing k2 = (Kucing) h2;
        k2.panjat();

        new B();

        Lingkaran l1 = new Lingkaran(5); 
        Titik l2 = new Titik(); 
        Lingkaran l3 = new Titik();
        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
