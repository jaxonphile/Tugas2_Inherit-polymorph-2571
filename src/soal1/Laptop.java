package soal1;

/**
 * kelas ini merupakan blueprint untuk objek Laptop
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Laptop extends Perangkat{
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Constructor untuk membuat objek Laptop
     * 
     * @param merk nama merek laptop
     * @param harga harga laptop
     * @param garansiBulan durasi garansi dalam bulan
     * @param ramGb kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     */
    public Laptop(String merk, double harga, int garansiBulan, int ramGb, double ukuranLayarInci)  {
        super(merk, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    public double hitungHargaPromo(double diskonPersen) {
        return this.harga - (this.harga * (diskonPersen / 100.0));
    }
    
}