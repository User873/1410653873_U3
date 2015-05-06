package at.ac.fh_kufstein.uebung_03.Classes;

public class Vehicle extends AbstractBenennbar
{

    private short wheels;
    private Color color;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;

    public Vehicle(short wheels, Color color, short ps, short doors)
    {
        this.wheels = wheels;
        this.color = color;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;

    }

    void start()
    {
        started = true;
    }

    void stop()
    {
        started = false;
    }

    void accelerate(short speed)
    {

        if (started == true && speed <= 250)
        {
            speed += speed;
        } else
        {
            System.out.println("You are already way too fast!");
        }

    }

    void braking(short speed)
    {
        if (started && speed >= 0)

        {
            speed += speed;
        } else
        {
            System.out.println("Release the brake!");
        }

    }

    public short getWheels()
    {
        return wheels;
    }

    public void setWheels(short wheels)
    {
        this.wheels = wheels;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public short getPs()
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }

    public short getDoors()
    {
        return doors;
    }

    public void setDoors(short doors)
    {
        this.doors = doors;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void setStarted(boolean started)
    {
        this.started = started;
    }

    public short getSpeed()
    {
        return speed;
    }

    public void setSpeed(short speed)
    {
        this.speed = speed;
    }
//    Aufgabe 3
//    @Override
//    public String getName()
//    {
//        return name;
//    }
//
//    @Override
//    public void setName(String _n)
//    {
//        name = _n; 
//    }

}
