public class Main {
    public static void main(String[] args) {
        Instruktur instruktur = new Instruktur("Eko", "eko@academia.ac.id", "Pemrograman Berorientasi Objek");
        System.out.println(instruktur.getInfo());
        System.out.println("===================================");

        Kursus kursus = instruktur.buatKursus("Java Lanjut", "Belajar OOP", 500_000);
        kursus.tambahKonten();
        System.out.println(kursus.infoKursus());
        System.out.println("===================================");

        Peserta peserta = new Peserta("Dimas", "DimasBudiawan@email.com");
        peserta.daftarKursus(kursus);
        System.out.println(peserta.getInfo());
        System.out.println("===================================");

        Konten v1 = new Video("Intro Java", "Video pengantar Java untuk pemula");
        Konten a1 = new Artikel("OOP Dasar", "Artikel membahas Encapsulation & Inheritance");
        Konten k1 = new Kuis("Kuis Java", "Uji pemahaman OOP", 5);

        System.out.println("=== TAMPILKAN KONTEN ===");
        System.out.println(peserta.aksesKonten(v1));
        System.out.println(peserta.aksesKonten(a1));
        System.out.println(peserta.aksesKonten(k1));
        System.out.println("===================================");

        ((Video) v1).play();
        ((Artikel) a1).baca();
        ((Kuis) k1).mulaiKuis();
        System.out.println("===================================");

        Pembayaran bayar = new Pembayaran(kursus.getHarga(), peserta.getNama(), kursus.getNama());
        System.out.println("Status sebelum bayar: " + bayar.getStatus());
        bayar.prosesPembayaran();
        bayar.konfirmasiBayar();
    }
}
