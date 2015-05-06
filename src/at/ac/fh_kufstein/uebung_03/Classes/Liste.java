package at.ac.fh_kufstein.uebung_03.Classes;

public class Liste
{

    private Object[] elements;
    private int pointer = 0;

    public Liste(int size) //sets the length of the array
    {
        elements = new Object[size];
    }

    public void save(Object param)
    {
        if (pointer < elements.length)
        {
            elements[pointer] = param;
            pointer++;
        }
    }

    public Object[] getElements()
    {
        return elements;

    }
}
