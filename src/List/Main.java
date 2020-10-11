package List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List mas = new List();

        Scanner scanner = new Scanner(System.in);
        byte menu;

        do{
            System.out.println("[1] Add new element at the beginning");
            System.out.println("[2] Add new element at the middle");
            System.out.println("[3] Delete the element from the beginning");
            System.out.println("[4] Delete the exact element");
            System.out.println("[5] Show all elements");
            System.out.println("[6] Exit");
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
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    mas.addMid(value);
                    break;
                }

                case 3:
                {
                    mas.delElement();
                    break;
                }

                case 4:
                {
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    mas.delExact(value);
                    break;
                }

                case 5:
                {
                    mas.show();
                    break;
                }
            }

        }while(menu != 6);

    }
}
