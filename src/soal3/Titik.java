package soal3;

/**
 * Kelas Titik digunakan untuk merepresentasikan posisi koordinat dua dimensi (x, y).
 * Kelas ini berfungsi sebagai komponen pembentuk struktur geometris dasar
 * dan menyediakan operasi penghitungan jarak Euclidean antar titik.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Titik {
    
    /**
     * Nilai koordinat x pada sumbu horizontal.
     */
    private double x;

    /**
     * Nilai koordinat y pada sumbu vertikal.
     */
    private double y;

    /**
     * Constructor default tanpa parameter.
     * Menginisialisasi titik berada pada pusat koordinat (0.0, 0.0).
     */
    public Titik() {
        this(0.0, 0.0);
    }

    /**
     * Constructor dengan spesifikasi nilai koordinat x dan y.
     * 
     * @param x nilai koordinat pada sumbu x
     * @param y nilai koordinat pada sumbu y
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengambil nilai koordinat x.
     * 
     * @return nilai x dalam tipe data double
     */
    public double getX() {
        return x;
    }

    /**
     * Mengubah atau menetapkan nilai koordinat x yang baru.
     * 
     * @param x nilai koordinat x baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengambil nilai koordinat y.
     * 
     * @return nilai y dalam tipe data double
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah atau menetapkan nilai koordinat y yang baru.
     * 
     * @param y nilai koordinat y baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak Euclidean antara posisi titik saat ini (this)
     * dengan posisi objek Titik lain yang dikirimkan.
     * 
     * @param lain objek Titik yang menjadi target pengukuran jarak
     * @return nilai jarak Euclidean dalam tipe data double
     */
    public double jarakKe(Titik lain) {
        double deltaX = lain.x - this.x;
        double deltaY = lain.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    /**
     * Mengembalikan representasi teks dari koordinat Titik dalam format (x, y).
     * Method ini men-override method default milik {@link java.lang.Object#toString()}.
     * 
     * @return String berformat "(x, y)" yang menampilkan nilai koordinat
     */
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}