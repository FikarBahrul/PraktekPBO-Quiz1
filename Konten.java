public class Konten {
    private String judul;
    private String isi;

    public Konten() {
        // constructor kosong
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String tampilkanKonten() {
        return "Judul: " + judul + "\nIsi: " + isi;
    }

    public void editKonten(String isiBaru) {
        this.isi = isiBaru;
    }
}
