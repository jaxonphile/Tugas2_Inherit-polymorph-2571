package soal2;

/**
 * Superclass Hewan untuk demonstrasi polimorfisme dan inheritance.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
class Hewan {
    protected String nama;

    /**
     * Constructor superclass hewan
     * 
     * @param nama nama hewan
     */
    Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + this.nama);
    }

    /**
     * Method untuk mengeluarkan suara secara umum.
     */
    void suara() {
        System.out.println("...");
    }

    /**
     * Method untuk mekanisme makan dan memanggil method suara().
     */
    void makan() {
        System.out.println(this.nama + " makan");
        suara();
    }
}
