package soal4;

/**
 * Merepresentasikan produk digital yang mendapat diskon digital.
 */
public class ProdukDigital extends Produk {

    private static final double DISKON_DIGITAL = 0.10;

    private final double ukuranMb;

    /**
     * Membuat produk digital baru.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb   ukuran berkas dalam megabyte, tidak boleh negatif
     * @throws IllegalArgumentException jika data tidak valid atau ukuran negatif
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb < 0) {
            throw new IllegalArgumentException("Ukuran tidak boleh negatif");
        }
        this.ukuranMb = ukuranMb;
    }

    /**
     * Mengambil ukuran produk.
     *
     * @return ukuran produk dalam megabyte
     */
    public double getUkuranMb() {
        return ukuranMb;
    }
    
}