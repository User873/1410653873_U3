package at.ac.fh_kufstein.uebung_03.Classes;

public class Car extends Vehicle
{

    private boolean ac;
    private short airbags;

    public Car(short airbags, short wheels, Color color, short ps, short doors)
    {
        super(wheels, color, ps, doors);
        this.ac = false;
        this.airbags = airbags;
    }

    void acOn()
    {
        if (ac == false)
        {
            ac = true;
        } else
        {
            System.out.println("The AC is already working!");
        }
    }

    void acOff()
    {
        if (ac == true)
        {
            ac = false;
        } else
        {
            System.out.println("The AC is already turned off!");
        }
    }

    public boolean isAc()
    {
        return ac;
    }

    public void setAc(boolean ac)
    {
        this.ac = ac;
    }

    @Override
    public String toString()
    {
        return "Mein Auto hat " + getPs() + " PS und fährt mit " + getSpeed() + " km/h";
    }
}
