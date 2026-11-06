package soal4;

/**
 * Merepresentasikan produk digital yang mendapat diskon digital.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 202
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
    
    /**
     * Menghitung harga akhir, yaitu harga dasar dikurangi diskon digital.
     *
     * @return harga dasar setelah diskon digital
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() - (getHargaDasar() * DISKON_DIGITAL);
    }

    /**
     * Memberikan keterangan jenis dan ukuran produk digital.
     *
     * @return keterangan, misalnya "digital 20.0 MB"
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}