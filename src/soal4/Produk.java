package soal4;

/**
 * Merepresentasikan produk umum yang dijual di toko digital.
 * Kelas ini menyimpan data dasar produk dan memastikan setiap nilai
 * yang disimpan lolos validasi.
 */
public class Produk {

    private static final String DESKRIPSI_UMUM = "produk umum";

    private final String kode;
    private final String nama;
    private final double hargaDasar;

    /**
     * Membuat produk baru setelah data melalui validasi.
     *
     * @param kode       kode unik produk, tidak boleh kosong
     * @param nama       nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar produk, tidak boleh negatif
     * @throws IllegalArgumentException jika kode atau nama kosong, atau harga dasar negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif");
        }
        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

     /**
     * Mengambil kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil harga dasar produk sebelum aturan tambahan diterapkan.
     *
     * @return harga dasar produk
     */
    public double getHargaDasar() {
        return hargaDasar;
    }

}