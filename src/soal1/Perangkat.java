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
}