package soal2;

/**
 * Superclass Lingkaran untuk demonstrasi overriding method Bagian C.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Lingkaran {
    protected double jariJari;

    /**
     * Constructor untuk inisialisasi jari-jari lingkaran.
     * 
     * @param r jari-jari lingkaran
     */
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran berdasarkan atribut r.
     * 
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * (2 * this.jariJari);
    }

    /**
     * Menghitung keliling lingkaran berdasarkan atribut r.
     * 
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * this.jariJari;
    }
}
