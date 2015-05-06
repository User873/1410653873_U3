package at.ac.fh_kufstein.uebung_03.Classes;

public class SaveListe
{

    public static void main(String[] args)
    {
        Liste l = new Liste(3); //length of the array
        l.save(2.5);
        l.save(5.0);
        l.save(200.0);

        for (Object element : l.getElements())
        {
            System.out.println(element);

        }

        Car bmw = new Car((short) 4, (short) 4, Color.SILVER, (short) 220, (short) 5);
        Car audi = new Car((short) 8, (short) 4, Color.BLACK, (short) 180, (short) 5);
        Boat titanic = new Boat((short) 0, Color.BLUE, (short) 51000, (short) 0, 10.54, (short) 3, 100000.00);
        int test = 4;

        GenericListe<Vehicle> genericList = new GenericListe<>(3);

        genericList.save(bmw);
        genericList.save(audi);
        genericList.save(titanic);
        //genericList.save(test); //TESTING! Not possible

        Vehicle[] vehicles = genericList.getElements(new Vehicle[0]);
        for (Vehicle vehicle : vehicles)
        {
            System.out.println(vehicle);
        }
    }
}
