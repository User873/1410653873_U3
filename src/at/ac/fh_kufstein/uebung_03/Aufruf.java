package at.ac.fh_kufstein.uebung_03;

import at.ac.fh_kufstein.uebung_03.Classes.Boat;
import at.ac.fh_kufstein.uebung_03.Classes.Car;
import at.ac.fh_kufstein.uebung_03.Classes.Color;

public class Aufruf
{

    public static void main(String[] args)
    {
        Car bmw = new Car((short) 4, (short) 4, Color.SILVER, (short) 220, (short) 5);
        Car audi = new Car((short) 8, (short) 4, Color.BLACK, (short) 180, (short) 5);
        Boat titanic = new Boat((short) 0, Color.BLUE, (short) 51000, (short) 0, 10.54, (short) 3, 100000.00);

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(titanic);
        bmw.setName("Bmw");
        System.out.println(bmw.getName());
    }
}
