package soal3;

/**
 * Kelas Garis yang tersusun atas dua objek Titik (Composition).
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Constructor utama yang menerima dua objek Titik.
     * Menggunakan defensive copy untuk mencegah aliasing dari luar.
     * 
     * @param awal titik awal garis
     * @param akhir titik akhir garis
     */
    public Garis(Titik awal, Titik akhir) {
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Constructor overload yang menerima nilai koordinat langsung.
     * Memanggil constructor utama menggunakan this(...) sesuai ketentuan.
     * 
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    // Getter dan Setter
    public Titik getAwal() {
        return new Titik(this.awal.getX(), this.awal.getY());
    }

    public void setAwal(Titik awal) {
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    public Titik getAkhir() {
        return new Titik(this.akhir.getX(), this.akhir.getY());
    }

    public void setAkhir(Titik akhir) {
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Menghitung panjang garis dengan mendelegasikan ke method jarakKe() milik kelas Titik.
     * 
     * @return panjang garis
     */
    public double getPanjang() {
        return this.awal.jarakKe(this.akhir);
    }

    @Override
    public String toString() {
        return this.awal.toString() + "-" + this.akhir.toString();
    }
}