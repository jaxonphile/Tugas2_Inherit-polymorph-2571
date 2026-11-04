package soal2;

/**
 * Subclass Kucing yang menurunkan kelas Hewan.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
class Kucing extends Hewan {
    
    /**
     * Constructor subclass Kucing.
     * 
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    @Override 
    void suara() {
        System.out.println("meong");
    }

    /**
     * Method khusus yang hanya dimiliki oleh kelas Kucing.
     */
    void panjat() {
        System.out.println(nama + "memanjat");
    }
}