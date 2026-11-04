package soal3;

/**
 * Superclass Titik untuk merepresentasikan koordinat 2 dimensi (x, y).
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Titik {
    double x;
    double y;

    /**
     * Constructor default untuk Titik (titik pusat 0,0).
     */
    public Titik() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor dengan koordinat spesifik
     * 
     * @param x nilai koordinat x
     * @param y nilai koordinat y
     */
    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getter untuk mengembalikan nilai x
     * 
     * @return
     */
    public double getX() {
        return x;
    }

    /**
     * setter untuk assign nilai koordinat x
     * 
     * @param x nilai koordinat x
     */
    public void setX(double x) {
        this.x = x;
    }

    
}
