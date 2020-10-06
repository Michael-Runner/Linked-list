package List;

public class List {
    private Element first;

    List()
    {

    }

    public void addElement(int value)
    {
        if (first == null)
        {
            first = new Element(value);
            first.setNext(null);
        }
        else
        {
            Element tmp = new Element(value);
            tmp.setNext(first);
            first = tmp;
        }
    }

    public void delElement()
    {
        if(first != null)
        {
            first = first.getNext();
            System.out.println("Successful");
        }
        else
        {
            System.out.println("Error");
        }
    }

    public void show(Element show)
    {
        /*Element show = new Element();
        show = first;*/
        if(show == null)
        {
            System.out.println("Empty");
        }
        else
        {
            while(show != null)
            {
                System.out.print(show.getValue() + " ");
                show = show.getNext();
            }
            System.out.println();
        }
    }

    public Element getFirst()
    {
        return first;
    }
}