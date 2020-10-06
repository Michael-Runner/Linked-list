package List;

public class Element {
    private int value;
    private Element next;

    Element()
    {

    }

    Element(int value)
    {
        this.value = value;
    }

    public void setNext(Element element)
    {
        next = element;
    }

    public Element getNext()
    {
        return next;
    }

    public int getValue()
    {
        return value;
    }
}