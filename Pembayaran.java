public class Pembayaran {
    private int jumlah;
    private String status;
    private String peserta;
    private String kursus;

    public Pembayaran(int jumlah, String peserta, String kursus) {
        this.jumlah = jumlah;
        this.peserta = peserta;
        this.kursus = kursus;
        this.status = "Pending";
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean prosesPembayaran() {
        this.status = "Berhasil";
        return true;
    }

    public void konfirmasiBayar() {
        System.out.println("Pembayaran " + peserta + " untuk kursus " + kursus + " telah " + status);
    }
}
