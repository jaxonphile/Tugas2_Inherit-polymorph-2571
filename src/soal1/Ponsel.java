package soal1;

/**
 * Kelas ini berperan sebagai chlid dari kelas Perangkat
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Constructor untuk objek laptop
     * 
     * @param merk merk Ponsel
     * @param harga harga ponsel
     * @param garansiBulan durasi garansi dalam bulan
     * @param kapasitasGb kapasitas storage dalam GB
     * @param jumlahKamera jumlah kamera
     */
    public Ponsel(String merk, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera) {
        super(merk, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    @Override 
    public String infoSingkat() {
        return super.infoSingkat() + " | " + this.kapasitasGb + " GB | " + this.jumlahKamera + " kamera";
    }
}