import java.util.Scanner;

class Shelf
{
    String[] s=new String[10];
    Scanner sc = new Scanner(System.in);

    public void addShelf()
    {
        System.out.println("Please enter the name of the item: ");
        String item=sc.nextLine();
        sc.nextLine();
        System.out.println("Please enter the shelf number (1-10): ");
        int index=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(i==index)
            {
                s[i-1]=item;
            }
            else
            {
                s[i]="empty";
            }
        }
    }
    public void removeShelf()
    {
        System.out.println("Please enter the shelf number (1-10): ");
        int index=sc.nextInt();
        s[index-1]="empty"; 
    }
    public void displayShelf()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Shelf "+i+": ["+s[i+1]+"]");
        }
    }
    public void menulist()
    {
        System.out.println("Welcome to the Warehouse Inventory Management System!\r\n" + //
                        "Please select an option from the following menu:\r\n" + //
                        "1.Add item to shelf\r\n" + //
                        "2.Remove item from shelf\r\n" + //
                        "3.Display contents of all shelves\r\n" + //
                        "4.Exit");
    }

    void mainMethod()
    {
        menulist();
        int ch;
        do{

            System.out.print("\n\nEnter choice: " );
             ch=sc.nextInt();

            switch (ch) {
                case 1:
                    addShelf();
                    break;
                case 2:
                    removeShelf();
                    break;
                case 3:
                    displayShelf();
                    break;
                
                default:
                    break;
            }
        }while(ch!=4);


    }

}

public class Ass8_5 {
    public static void main(String[] args) {
        
        Shelf s = new Shelf();
        s.mainMethod();
    }
}
