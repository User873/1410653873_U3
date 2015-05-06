package at.ac.fh_kufstein.uebung_03.Classes;

public abstract class AbstractBenennbar implements Benennbar
{

    protected String name;

    public String getName()
    {
        return name;
    }

    public void setName(String _n)
    {
        name = _n;
    }

}
