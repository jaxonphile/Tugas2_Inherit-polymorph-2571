/**
 * Kelas ini merupakan kelas superclass 
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */

public class Perangkat {
    // atribut 
    private String merk;
    protected double harga;
    private int garansiBulan;

    public static final double TARIF_PAJAK = 0.10;

    /**
     * Method constructor unutk membuat objek dari kelas Perangkat
     * 
     * @param merk
     * @param harga
     * @param garansiBulan
     */
    public Perangkat(String merk, double harga, int garansiBulan) {
        this.merk = merk;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Method getter untuk mengembalikan nilai atribut merk
     * 
     * @return atribut merk
     */
    public String getMerk() {
        return this.merk;
    }
    
    /**
     * Method getter untuk mengembalikan nilai atribut garansiBulan
     * @return atribut garansiBulan
     */
    public int getGaransiBulan() {
        return this.garansiBulan;
    }

    public int hitungPajak() {
        return this.harga * TARIF_PAJAK;
    }
}