package soal3;

/**
 * Kelas Titik untuk merepresentasikan koordinat 2D (x, y).
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Titik {
    private double x;
    private double y;

    /**
     * Constructor kosong yang menginisialisasi titik di (0.0, 0.0).
     */
    public Titik() {
        this(0.0, 0.0);
    }

    /**
     * Constructor dengan nilai koordinat (x, y).
     * 
     * @param x nilai koordinat x
     * @param y nilai koordinat y
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter dan Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak Euclidean antara titik ini (this) dengan titik lain.
     * 
     * @param lain objek Titik tujuan
     * @return jarak antara dua titik
     */
    public double jarakKe(Titik lain) {
        double deltaX = lain.x - this.x;
        double deltaY = lain.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}