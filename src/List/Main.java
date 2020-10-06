package List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List mas = new List();

        Scanner scanner = new Scanner(System.in);
        byte menu;

        do{
            System.out.println("[1] Add new element at the beginning");
            System.out.println("[2] Delete the element from the beginning");
            System.out.println("[3] Show all elements");
            System.out.println("[4] Exit");
            menu = scanner.nextByte();

            switch (menu)
            {
                case 1:
                {
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    mas.addElement(value);
                    break;
                }

                case 2:
                {
                    mas.delElement();
                    break;
                }

                case 3:
                {
                    mas.show(mas.getFirst());
                    break;
                }
            }

        }while(menu != 4);

    }
}
