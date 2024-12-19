package pion;

public class Benteng extends Pion{
    public Benteng(String warna, String lokasi) {
        super(warna);
    }


    public String getSuperColor() {
        return super.getWarna();
    }

    @Override
    public void move() {
        System.out.println("Benteng Bergerak");
    }


}
