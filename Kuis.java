public class Kuis extends Konten {
    private int jumlahSoal;

    public Kuis(String judul, String isi, int jumlahSoal) {
        setJudul(judul);
        setIsi(isi);
        this.jumlahSoal = jumlahSoal;
    }

    public int getJumlahSoal() {
        return jumlahSoal;
    }

    public void setJumlahSoal(int jumlahSoal) {
        this.jumlahSoal = jumlahSoal;
    }

    @Override
    public String tampilkanKonten() {
        return "[KUIS] " + getJudul() + "\nJumlah Soal: " + jumlahSoal + "\n" + getIsi();
    }

    public void mulaiKuis() {
        System.out.println("Kuis dimulai! Jumlah soal: " + jumlahSoal);
    }
}
