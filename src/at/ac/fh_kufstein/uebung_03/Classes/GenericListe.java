package at.ac.fh_kufstein.uebung_03.Classes;

public class GenericListe<T extends Benennbar>
{

    private int pointer = 0;
    private Object[] elements;

    public GenericListe(int size)
    {
        elements = new Object[size];
    }

    public void save(T param)
    {
        if (pointer < elements.length)
        {
            elements[pointer] = param;
            pointer++;
        }
    }

    public <T> T[] getElements(T[] a)
    {
        return (T[]) java.util.Arrays.copyOf(elements, pointer, a.getClass()); //a.getClass() is a vechicle array type
    }
}
