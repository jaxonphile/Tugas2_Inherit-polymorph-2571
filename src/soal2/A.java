package soal2;

/**
 * Superclass A untuk mengamati urutan pemanggilan constructor pada Bagian B.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class A {

    /**
     * Constructor default kelas A.
     */
    A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Menampilkan teks "init A", tanda bahwa objek dari
     * kelas A telah diinisiasi.
     */
    void init() {
        System.out.println("init A");
    }
}
