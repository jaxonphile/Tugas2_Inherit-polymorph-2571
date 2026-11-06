package soal4;

/**
 * Merepresentasikan produk fisik yang dikenai ongkos kirim berdasarkan berat.
 */
public class ProdukFisik extends Produk {

    private static final double ONGKOS_KIRIM_PER_KG = 10000;

    private final double beratKg;

    /**
     * Membuat produk fisik baru.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg    berat produk dalam kilogram, tidak boleh negatif
     * @throws IllegalArgumentException jika data tidak valid atau berat negatif
     */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat tidak boleh negatif");
        }
        this.beratKg = beratKg;
    }

    /**
     * Mengambil berat produk.
     *
     * @return berat produk dalam kilogram
     */
    public double getBeratKg() {
        return beratKg;
    }

    /**
     * Menghitung harga akhir, yaitu harga dasar ditambah ongkos kirim.
     *
     * @return harga dasar + (berat x ongkos kirim per kg)
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + (beratKg * ONGKOS_KIRIM_PER_KG);
    }

    /**
     * Memberikan keterangan jenis dan berat produk fisik.
     *
     * @return keterangan, misalnya "fisik 1.5 kg"
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }

}