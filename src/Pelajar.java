import beasiswa.BeasiswaPelajar;

public class Pelajar implements BeasiswaPelajar {
    private String nama;
    private int usia;
    private double nilai1, nilai2, nilai3;

    public Pelajar(String nama, int usia, double nilai1, double nilai2, double nilai3) {
        this.nama = nama;
        this.usia = usia;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public void setNilaiPelajar(double nilai1, double nilai2, double nilai3) {
        this.nilai1 = nilai1;
        this.nilai1 = nilai1;
        this.nilai1 = nilai1;
    }


    public void display() {
        System.out.println("\n");
        System.out.println("+-------+");
        System.out.println("| HASIL |");
        System.out.println("+-------+");
        System.out.println("\n");

        System.out.println("\tNilai Akhir\t: " + nilaiAkhir());

        if(nilaiAkhir() < 87.5) {
            System.out.println("\tKETERANGAN\t: TIDAK DITERIMA");
            System.out.println("\tMohon maaf, " + nama + " (" + usia + ") dinyatakan tidak diterima pada program BEASISWA PELAJAR karena belum mencapai nilai yang diharapkan pada tahap seleksi.");
        } else {
            System.out.println("\tKETERANGAN\t: DITERIMA");
            System.out.println("\tSelamat! " + nama + " (" + usia + ") dinyatakan diterima pada program BEASISWA PELAJAR karena telah mencapai nilai yang diharapkan pada tahap seleksi.");
        }
    }

    @Override
    public double nilaiAkhir() {
        return ((nilai1 * 0.5) + (nilai2 * 0.2) + (nilai3 * 0.3));
    }
}