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

    public void addMid(int value)
    {
        if(first!=null)
        {
            if(value < first.getValue())
            {
                Element tmp = new Element(value);
                tmp.setNext(first);
                first = tmp;
            }
            else
            {
                Element element = new Element();
                element = first;

                while(element.getNext()!=null && value > element.getNext().getValue())
                {
                    element = element.getNext();
                }

                if(element.getNext() != null)
                {
                    Element tmp = new Element(value);
                    tmp.setNext(element.getNext());
                    element.setNext(tmp);
                }
                else
                {
                    Element tmp = new Element(value);
                    tmp.setNext(null);
                    element.setNext(tmp);
                }
            }
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

    public void delExact(int value)
    {
        if(first != null)
        {
            if(first.getValue() == value)
            {
                first = first.getNext();
                return;
            }

            Element element = first;

            while(element.getNext().getValue() != value && element.getNext() != null)
            {
                element = element.getNext();

                if(element.getNext() == null)
                {
                    System.out.println("Error");
                    return;
                }
            }

            if(element.getNext().getValue() == value)
            {
                element.setNext(element.getNext().getNext());
            }
        }
        else
        {
            System.out.println("Error");
        }
    }

    public void show()
    {
        Element show = new Element();
        show = first;

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