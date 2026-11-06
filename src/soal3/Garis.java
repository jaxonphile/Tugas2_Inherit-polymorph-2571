package soal3;

/**
 * Kelas Garis merepresentasikan bentuk garis dua dimensi yang tersusun atas dua buah objek Titik (Composition).
 * Memiliki fitur pengolahan koordinat awal dan akhir serta mendelegasikan penghitungan panjang garis.
 * 
 * @author Arienal Zacky Irfan
 * @version 1.0
 * @since 2026
 */
public class Garis {

    /**
     * Objek Titik yang menandai titik awal dari garis.
     */
    private Titik awal;

    /**
     * Objek Titik yang menandai titik akhir dari garis.
     */
    private Titik akhir;

    /**
     * Constructor utama yang menerima dua objek Titik.
     * Menerapkan teknik Defensive Copy untuk mencegah masalah aliasing dari referensi luar.
     * 
     * @param awal objek Titik sebagai posisi awal garis
     * @param akhir objek Titik sebagai posisi akhir garis
     */
    public Garis(Titik awal, Titik akhir) {
        this.awal = new Titik(awal.getX(), awal.getY());
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Constructor overload yang menerima parameter nilai koordinat secara langsung.
     * Memanggil constructor utama melalui keyword {@code this(...)} sesuai ketentuan.
     * 
     * @param x1 nilai koordinat x untuk titik awal
     * @param y1 nilai koordinat y untuk titik awal
     * @param x2 nilai koordinat x untuk titik akhir
     * @param y2 nilai koordinat y untuk titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengambil objek Titik awal dari garis.
     * Mengembalikan salinan baru (defensive copy) agar objek internal tidak terikat dengan referensi luar.
     * 
     * @return objek Titik yang merupakan salinan dari titik awal
     */
    public Titik getAwal() {
        return new Titik(this.awal.getX(), this.awal.getY());
    }

    /**
     * Mengubah atau menetapkan objek Titik awal dari garis.
     * Menggunakan defensive copy saat menyimpan objek baru.
     * 
     * @param awal objek Titik baru untuk titik awal
     */
    public void setAwal(Titik awal) {
        this.awal = new Titik(awal.getX(), awal.getY());
    }

    /**
     * Mengambil objek Titik akhir dari garis.
     * Mengembalikan salinan baru (defensive copy) agar objek internal tidak terikat dengan referensi luar.
     * 
     * @return objek Titik yang merupakan salinan dari titik akhir
     */
    public Titik getAkhir() {
        return new Titik(this.akhir.getX(), this.akhir.getY());
    }

    /**
     * Mengubah atau menetapkan objek Titik akhir dari garis.
     * Menggunakan defensive copy saat menyimpan objek baru.
     * 
     * @param akhir objek Titik baru untuk titik akhir
     */
    public void setAkhir(Titik akhir) {
        this.akhir = new Titik(akhir.getX(), akhir.getY());
    }

    /**
     * Menghitung total panjang garis dengan mendelegasikan penghitungan jarak 
     * ke method {@link Titik#jarakKe(Titik)} milik objek titik awal.
     * 
     * @return nilai panjang garis dalam tipe data double
     */
    public double getPanjang() {
        return this.awal.jarakKe(this.akhir);
    }

    /**
     * Mengembalikan representasi teks dari Garis dalam format "(x1, y1)-(x2, y2)".
     * Memanfaatkan implementasi {@link Titik#toString()}.
     * 
     * @return String teks koordinat garis
     */
    @Override
    public String toString() {
        return this.awal.toString() + "-" + this.akhir.toString();
    }
}