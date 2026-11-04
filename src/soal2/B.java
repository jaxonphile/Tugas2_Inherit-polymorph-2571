package soal2;

/**
 * Subclass B yang menurunkan kelas A untuk Bagian B.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
class B extends A {
    int nilai = 5;

    /**
     * Constructor default kelas B.
     */
    B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    @Override 
    void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
