public class Artikel extends Konten {
    public Artikel(String judul, String isi) {
        setJudul(judul);
        setIsi(isi);
    }

    @Override
    public String tampilkanKonten() {
        return "[ARTIKEL] " + getJudul() + "\n" + getIsi();
    }

    public void baca() {
        System.out.println("Membaca artikel: " + getJudul());
    }
}
