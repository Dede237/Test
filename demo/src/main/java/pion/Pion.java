package pion;

public class Pion {
     private String warna;
     private String lokasi;

    public Pion(String warna) {
        this.warna = warna;
        System.out.println("Contructor Dijalankan");
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void move() {
        System.out.println("Pion Bergerak");
    }
     
}
