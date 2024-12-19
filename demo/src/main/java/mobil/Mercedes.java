package mobil;

public class Mercedes extends Mobil{
    public Mercedes(String warna, String nama, int topSpeed) {
        super(warna, nama, topSpeed);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " Bergerak");
    }

    public void merubahWarna(String warna) {
        setWarna(warna);
    }
}
