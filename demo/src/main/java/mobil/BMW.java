package mobil;

public class BMW extends Mobil{
    public BMW(String warna, String nama, int topSpeed) {
        super(warna, nama, topSpeed);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " Bergerak");
    }
}
