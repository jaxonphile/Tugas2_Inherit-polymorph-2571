package soal2;

/**
 * Subclass Titik yang men-override luas dan keliling dari Lingkaran.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Titik extends Lingkaran {

    /**
     * Constructor default tanpa parameter untuk memproses new Titik()
     */
    public Titik() {
        super(0);
    }
    
    /**
     * Constructor Titik. Nilai jari-jari diteruskan ke superclass (biasanya 0).
     * 
     * @param r jari-jari titik
     */
    public Titik(double jariJari) {
        super(jariJari);
    }

    /**
     * Overriding method luas: Titik tidak memiliki luas (selalu 0).
     * 
     * @return 0.0
     */
    @Override 
    public double luas() {
        return 0;
    }

    /**
     * Overriding method keliling: Titik tidak memiliki keliling (selalu 0).
     * 
     * @return 0.0
     */
    public double keliling() {
        return 0;
    }
}
