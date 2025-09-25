public class Video extends Konten {
    public Video(String judul, String isi) {
        setJudul(judul);
        setIsi(isi);
    }

    @Override
    public String tampilkanKonten() {
        return "[VIDEO] " + getJudul() + "\n" + getIsi();
    }

    public void play() {
        System.out.println("Memutar video: " + getJudul());
    }
}
