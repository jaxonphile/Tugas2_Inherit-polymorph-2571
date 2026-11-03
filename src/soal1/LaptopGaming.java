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

    public LaptopGaming(String merk, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merk, harga, garansiBulan, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    @Override 
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + this.kartuGrafis;
    }
}
