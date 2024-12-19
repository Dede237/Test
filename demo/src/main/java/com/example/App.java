package com.example;

import bangundatar.BangunDatar;
import mobil.BMW;
import mobil.Jeep;
import mobil.Mercedes;
import mobil.Mobil;
import pion.Benteng;
import pion.Pion;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        Mercedes mercedes = new Mercedes("Hitam", "Mercedes", 150);
        BMW bmw = new BMW("Hitam", "BMW", 150);
        Jeep jeep = new Jeep("Putih", "Jeep", 100, 20);
        Mobil mobil = new Mobil("Putih", null, 0);
        mercedes.bergerak();
        bmw.bergerak();
        mercedes.merubahWarna("Merah");
        System.out.println(jeep.getTinggi());
        System.out.println(mobil.getWarna());
        
    }
}
