package soal3;

/**
 * Main Class pengujian Soal 3 untuk kelas Titik dan Garis.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class TesSoal3 {

    /**
     * Method utama untuk mengeksekusi pengujian kelas Titik dan Garis.
     * 
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Garis g = new Garis(0, 0, 3, 4);
        System.out.println(g + " panjang=" + g.getPanjang());
        
        Titik t = new Titik(1, 1);
        Garis g2 = new Garis(t, new Titik(5, 5)); t.setX(100);
        System.out.println(g2);
    }
}