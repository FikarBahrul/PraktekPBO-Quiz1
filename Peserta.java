public class Peserta {
    private String nama;
    private String email;
    private String kursus;

    public Peserta(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKursus() {
        return kursus;
    }

    public void setKursus(String kursus) {
        this.kursus = kursus;
    }

    public void daftarKursus(Kursus k) {
        this.kursus = k.getNama();
        k.tambahPeserta();
    }

    public String aksesKonten(Konten konten) {
        return konten.tampilkanKonten();
    }

    public String getInfo() {
        return "Peserta: " + nama + " | Email: " + email + " | Kursus: " + kursus;
    }
}
