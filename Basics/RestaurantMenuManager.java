

import java.util.Scanner;

public class RestaurantMenuManager {
    private static final int MAX_DISHES = 10;
    private String[] menu;
    private double[] prices;
    private int numDishes;
    private Scanner scanner;

    public RestaurantMenuManager() {
        menu = new String[MAX_DISHES];
        prices = new double[MAX_DISHES];
        numDishes = 0;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        if (numDishes == 0) {
            System.out.println("The menu is empty.");
            return;
        }
        System.out.println("Menu:");
        for (int i = 0; i < numDishes; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - $" + prices[i]);
        }
    }

    public void addDish() {
        if (numDishes == MAX_DISHES) {
            System.out.println("Cannot add more dishes. Menu is full.");
            return;
        }
        System.out.print("Enter the name of the new dish: ");
        String dishName = scanner.nextLine();
        System.out.print("Enter the price of the new dish: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        menu[numDishes] = dishName;
        prices[numDishes] = price;
        numDishes++;
        System.out.println("Dish added to the menu.");
    }

    public void removeDish() {
        if (numDishes == 0) {
            System.out.println("The menu is already empty.");
            return;
        }
        displayMenu();
        System.out.print("Enter the index of the dish to remove: ");
        int index = scanner.nextInt();
        if (index < 1 || index > numDishes) {
            System.out.println("Invalid index.");
            return;
        }
        index--; // Adjust index to array index
        for (int i = index; i < numDishes - 1; i++) {
            menu[i] = menu[i + 1];
            prices[i] = prices[i + 1];
        }
        menu[numDishes - 1] = null;
        prices[numDishes - 1] = 0;
        numDishes--;
        System.out.println("Dish removed from the menu.");
    }

    public void modifyPrice() {
        if (numDishes == 0) {
            System.out.println("The menu is empty.");
            return;
        }
        displayMenu();
        System.out.print("Enter the index of the dish to modify: ");
        int index = scanner.nextInt();
        if (index < 1 || index > numDishes) {
            System.out.println("Invalid index.");
            return;
        }
        index--; // Adjust index to array index
        System.out.print("Enter the new price for the dish: ");
        double newPrice = scanner.nextDouble();
        prices[index] = newPrice;
        System.out.println("Price modified successfully.");
    }

    public void start() {
        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("a. View the current menu with prices");
            System.out.println("b. Add a new dish to the menu");
            System.out.println("c. Remove a dish from the menu");
            System.out.println("d. Modify the price of a dish on the menu");
            System.out.println("e. Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline character after reading choice
            switch (choice) {
                case 'a':
                    displayMenu();
                    break;
                case 'b':
                    addDish();
                    break;
                case 'c':
                    removeDish();
                    break;
                case 'd':
                    modifyPrice();
                    break;
                case 'e':
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'e');
    }

    public static void main(String[] args) {
        RestaurantMenuManager menuManager = new RestaurantMenuManager();
        menuManager.start();
    }
}
