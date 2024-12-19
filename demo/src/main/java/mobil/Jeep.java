package mobil;

public class Jeep extends Mobil{
    private int tinggi;

    public Jeep(String warna, String nama, int topSpeed, int tinggi) {
        super(warna, nama, topSpeed);
        setTinggi(tinggi);
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " Bergerak");
    }

    
}
