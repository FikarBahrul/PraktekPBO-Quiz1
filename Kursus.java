public class Kursus {
    private String nama;
    private String deskripsi;
    private int harga;
    private Instruktur instruktur;
    private int jumlahKonten;
    private int jumlahPeserta;

    public Kursus(String nama, String deskripsi, int harga, Instruktur instruktur) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.instruktur = instruktur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Instruktur getInstruktur() {
        return instruktur;
    }

    public void setInstruktur(Instruktur instruktur) {
        this.instruktur = instruktur;
    }

    public void tambahKonten() {
        jumlahKonten++;
    }

    public void tambahPeserta() {
        jumlahPeserta++;
    }

    public String infoKursus() {
        return "Kursus: " + nama + "\nDeskripsi: " + deskripsi + "\nHarga: " + harga +
               "\nInstruktur: " + instruktur.getNama() +
               "\nKonten: " + jumlahKonten + " | Peserta: " + jumlahPeserta;
    }
}
