package soal4;

/**
 * Merepresentasikan produk langganan berbasis durasi bulan.
 * Langganan tidak memakai diskon digital, tetapi mendapat diskon
 * langganan jika durasinya mencapai batas minimal.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 202
 */
public class Langganan extends ProdukDigital {

    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_BULAN_DISKON = 12;

    private final int durasiBulan;

    /**
     * Membuat produk langganan baru.
     *
     * @param kode        kode unik produk
     * @param nama        nama produk
     * @param hargaDasar  harga dasar per bulan
     * @param ukuranMb    ukuran berkas dalam megabyte
     * @param durasiBulan durasi langganan dalam bulan, harus lebih dari nol
     * @throws IllegalArgumentException jika data tidak valid atau durasi tidak positif
     */
    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan <= 0) {
            throw new IllegalArgumentException("Durasi harus lebih dari nol");
        }
        this.durasiBulan = durasiBulan;
    }

    /**
     * Mengambil durasi langganan.
     *
     * @return durasi langganan dalam bulan
     */
    public int getDurasiBulan() {
        return durasiBulan;
    }

    /**
     * Menghitung harga akhir, yaitu harga dasar dikali durasi. Diskon langganan
     * diberikan jika durasi minimal sama dengan batas bulan diskon.
     *
     * @return total harga langganan setelah diskon (jika berhak)
     */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * durasiBulan;
        if (durasiBulan >= BATAS_BULAN_DISKON) {
            total -= total * DISKON_LANGGANAN;
        }
        return total;
    }

    /**
     * Memberikan keterangan jenis dan durasi langganan.
     *
     * @return keterangan, misalnya "langganan 12 bulan"
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}