package mobil;

public class Mobil {
    private String warna;
    private String nama;
    private int topSpeed;

    public Mobil(String warna, String nama, int topSpeed) {
        this.warna = warna;
        this.nama = nama;
        this.topSpeed = topSpeed;
    }

    public void bergerak(){
        System.out.println("Mobil Bergerak");
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
