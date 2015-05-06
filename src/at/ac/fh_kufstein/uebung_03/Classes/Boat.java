package at.ac.fh_kufstein.uebung_03.Classes;

public class Boat extends Vehicle
{

    private double draft;
    private short propeller;
    private double cargo;

    public Boat(short tires, Color color, short ps, short doors, double draft, short propeller, double cargo)
    {
        super(tires, color, ps, doors);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }

    void unload() throws InterruptedException
    {
        cargo = 0;
        Thread.sleep(5000);

    }

    public double getDraft()
    {
        return draft;
    }

    public void setDraft(double draft)
    {
        this.draft = draft;
    }

    public short getPropeller()
    {
        return propeller;
    }

    public void setPropeller(short propeller)
    {
        this.propeller = propeller;
    }

    public double getCargo()
    {
        return cargo;
    }

    public void setCargo(double cargo)
    {
        this.cargo = cargo;
    }

    @Override
    public String toString()
    {
        return "Mein Wasserfahrzeug hat " + getPs() + " PS und einen Tiefgang von " + getDraft() + " m";
    }
}
