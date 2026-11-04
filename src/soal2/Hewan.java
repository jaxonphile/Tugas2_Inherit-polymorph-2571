package soal2;

public class Hewan {
    protected String nama;

    /**
     * Constructor superclass hewan
     * 
     * @param nama nama hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + this.nama);
    }
}
