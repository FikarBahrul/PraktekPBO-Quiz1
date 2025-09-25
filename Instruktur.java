public class Instruktur {
    private String nama;
    private String email;
    private String keahlian;

    public Instruktur(String nama, String email, String keahlian) {
        this.nama = nama;
        this.email = email;
        this.keahlian = keahlian;
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

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public Kursus buatKursus(String namaKursus, String deskripsi, int harga) {
        return new Kursus(namaKursus, deskripsi, harga, this);
    }

    public String getInfo() {
        return "Instruktur: " + nama + " | Email: " + email + " | Keahlian: " + keahlian;
    }
}
