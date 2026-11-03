package soal1;

/**
 * Kelas ini merupakan child dari Laptop
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class LaptopGaming extends Laptop {
    String kartuGrafis;
    public static final int GARANSI_TAMBAHAN = 6;

    public LaptopGaming(String merk, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merk, harga, garansiBulan + GARANSI_TAMBAHAN, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    @Override 
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + this.kartuGrafis;
    }
}
