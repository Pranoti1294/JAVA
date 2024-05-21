import java.util.*;

class Restaurant
{
    Scanner sc = new Scanner(System.in);
    String menu[]=new String[10];
    int price[]=new int[10],numDish=0;

   
    public void addMenu(){

        if(price.length==numDish)
        {
            System.out.println(" We cannot add it is full ");
            return;
        }
        
        System.out.print("\n\nEnter Menu dish : ");
        sc.nextLine();
        menu[numDish]=sc.nextLine();
        System.out.print("Enter price : ");
        price[numDish]=sc.nextInt();
        
        numDish++;
        
    }

    public void menuList()
    {
        if(numDish==0)
        {
            System.out.println("\nEmpty menu list...");
            return;
        }
        System.out.println("------------Menulist Is Here-------------");
        System.out.println("     Name    ---->   Price ");
        for(int i=0;i<numDish;i++)
        {
            System.out.println((i+1)+". "+this.menu[i]+"  ---->   "+this.price[i]);
        }
    }


    void removeMenu()
    {
        if(numDish==0)
        {
            System.out.println("\nEmpty menu list...");
            return;
        }
        System.out.print("\n\nEnter index to remove: ");
        int x=sc.nextInt();
        x--;
        for(int i=x;i<numDish-1;i++)
        {
            menu[i]=menu[i+1];
            price[i]=price[i+1];

        }
        menu[numDish-1]=null;
        price[numDish-1]=0;

        System.out.println("successfully deleted element..");
        
    }


    public void updatePrice()
    {
        if (numDish == 0) {
            System.out.println("The menu is empty.");
            return;
        }
        System.out.print("\n\nEnter index to remove: ");
        int x=sc.nextInt();
        System.out.print("Enter price to update: ");
        int chprice= sc.nextInt();
        price[x-1]=chprice;

    }

    void choice()
    {
        System.out.println("----Welcome to our Restaurant----");
        System.out.println("1.View the current menu with prices\r\n" + //
                        "2. Add a new dish to the menu\r\n" + //
                        "3. Remove a dish from the menu\r\n" + //
                        "4. Modify the price of a dish on the menu\r\n" + //
                        "5. Exit the program");
    }
    void mainMethod()
    {
        choice();
        int ch;
        do{

            System.out.print("\n\nEnter choice: " );
             ch=sc.nextInt();

            switch (ch) {
                case 1:
                    menuList();
                    break;
                case 2:
                    addMenu();
                    break;
                case 3:
                    removeMenu();
                    break;
                case 4:
                    updatePrice();
                    break;
                case 5:
                    break;
                
                default:
                    break;
            }
        }while(ch!=5);


    }

}

public class Ass8_2 {
    public static void main(String[] args) {
       // String menu[]=new String[20];
        
       // int price[]=new int[20];

       

        Restaurant r = new Restaurant();
        r.mainMethod();
        
        
    }
}
