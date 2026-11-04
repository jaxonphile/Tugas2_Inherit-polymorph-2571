package soal3;

public class Garis extends Titik {
    private Titik titikAkhir;

    public Garis() {
        super(0,0);
        this.titikAkhir = new Titik(0.0, 0.0);
    }

    public Garis(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.titikAkhir = new Titik(x2, y2);
    }

    public Garis(Titik tAwal, Titik tAkhir) {
        super(tAwal.getX(), tAwal.getY());
        this.titikAkhir = tAkhir;
    }

    public double hitungPanjang() {
        double deltaX = this.titikAkhir.getX() - this.x;
        double deltaY = this.titikAkhir.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override 
    public void cetak() {
        System.out.println("Garis dari (" + this.x + ", " + this.y + ") ke (" 
                           + this.titikAkhir.getX() + ", " + this.titikAkhir.getY() + ")");
        System.out.printf("Panjang Garis: %.2f\n", hitungPanjang());
    }
}
