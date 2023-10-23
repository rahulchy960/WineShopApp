import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import myPackage.Alcohol;


// Whiskey class, derived from Alcohol
class Whiskey extends Alcohol {  
    private String type;

    public Whiskey(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Wine class, derived from Alcohol
class Wine extends Alcohol {
    private String type;

    public Wine(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Gin class, derived from Alcohol
class Gin extends Alcohol {
    public Gin(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public String getType() {
        return "Gin";
    }
}

// Vodka class, derived from Alcohol
class Vodka extends Alcohol {
    public Vodka(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public String getType() {
        return "Vodka";
    }
}

// Rum class, derived from Alcohol
class Rum extends Alcohol {
    public Rum(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public String getType() {
        return "Rum";
    }
}

// Beer class, derived from Alcohol
class Beer extends Alcohol {
    public Beer(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public String getType() {
        return "Beer";
    }
}

//The WineShop class managing all the menu 
class WineShop {


    private List<Whiskey> whiskeys = new ArrayList<>(); //ArrayList for containing Whiskeys
    private List<Wine> wines = new ArrayList<>();       //ArrayList for containing Wines
    private List<Gin> gins = new ArrayList<>();         //ArrayList for containing Gins
    private List<Vodka> vodkas = new ArrayList<>();     //ArrayList for containing Vodkas
    private List<Rum> rums = new ArrayList<>();         //ArrayList for containing Rum
    private List<Beer> beers = new ArrayList<>();       //ArrayList for containing Beer


    public void addItem(String name, double price, int quantity, String alcoholType, String subtype){
        
        //If the item is Whiskey store it in Arraylist Whiskey 
        if (alcoholType.equals("Whiskey")) {  
            if (subtype.equals("Malted") || subtype.equals("Scotch")) {
                whiskeys.add(new Whiskey(name, price, quantity, subtype));
            } 
            else {
                System.out.println("Invalid Whiskey subtype: " + subtype + ". Item not added.");
            }
        }
        
        //If the item is Wine store it in Arraylist Wine 
        else if (alcoholType.equals("Wine")) {  
            if (subtype.equals("Red Wine") || subtype.equals("White Wine")) {
                wines.add(new Wine(name, price, quantity, subtype));
            } 
            else{
                System.out.println("Invalid Wine subtype: " + subtype + ". Item not added.");
            }
        } 

        //If the item is Gin store it in Arraylist Gin
        else if (alcoholType.equals("Gin")) {
            gins.add(new Gin(name, price, quantity));
        } 

        //If the item is Vodka store it in Arraylist Vodkas
        else if (alcoholType.equals("Vodka")) {
            vodkas.add(new Vodka(name, price, quantity));
        } 

        //If the item is Rum store it in Arraylist Rum 
        else if (alcoholType.equals("Rum")) {
            rums.add(new Rum(name, price, quantity));
        } 

        //If the item is Beer store it in Arraylist Beer
        else if (alcoholType.equals("Beer")) {
            beers.add(new Beer(name, price, quantity));
        } 

        //If the input type of alcohol not matched
        else {
            System.out.println("Invalid type of alcohol: " + alcoholType + ". Item not added.");
        }
    
    
    }
    
    //countItems() function returns the total number of Items Present In the Inventory At that Time 
    public int countItems() {
        return whiskeys.size() + wines.size() + gins.size() + vodkas.size() + rums.size() + beers.size();
    }


    
    //SellItem Method is used for Selling the item and modify the inventory
    public void sellItem(String name, int amount) {


        for (Whiskey whiskey : whiskeys) {  //For Selling Whiskeys
            if (whiskey.getName().equals(name)) { 
                //If the Item is Available
                if (whiskey.sell(amount)) { 
                    System.out.println("Sold " + amount + " " + name + " for $" + whiskey.getPrice() * amount);
                } 
                //If the item is not available
                else {
                    System.out.println("Insufficient quantity of " + name + " in stock.");
                }
                return;
            }
        }

        for (Wine wine : wines) {   //For Selling Wines
            if (wine.getName().equals(name)) {
                if (wine.sell(amount)) {
                    System.out.println("Sold " + amount + " " + name + " for $" + wine.getPrice() * amount);
                } 
                else {
                    System.out.println("Insufficient quantity of " + name + " in stock.");
                }
                return;
            }
        }

        for (Gin gin : gins) {    //For selling Gins
            if (gin.getName().equals(name)) {
                if (gin.sell(amount)) {
                    System.out.println("Sold " + amount + " " + name + " for $" + gin.getPrice() * amount);
                } 
                else {
                    System.out.println("Insufficient quantity of " + name + " in stock.");
                }
                return;
            }
        }

        for (Vodka vodka : vodkas) {  //For selling Vodkas
            if (vodka.getName().equals(name)) {
                if (vodka.sell(amount)) {
                    System.out.println("Sold " + amount + " " + name + " for $" + vodka.getPrice() * amount);
                } 
                else {
                    System.out.println("Insufficient quantity of " + name + " in stock.");
                }
                return;
            }
        }

        for (Rum rum : rums) {   //For Selling Rums
            if (rum.getName().equals(name)) {
                if (rum.sell(amount)) {
                    System.out.println("Sold " + amount + " " + name + " for $" + rum.getPrice() * amount);
                } 
                else {
                    System.out.println("Insufficient quantity of " + name + " in stock.");
                }
                return;
            }
        }

        for (Beer beer : beers) {   //For Selling Beers
            if (beer.getName().equals(name)) {
                if (beer.sell(amount)) {
                    System.out.println("Sold " + amount + " " + name + " for $" + beer.getPrice() * amount);
                } 
                else {
                    System.out.println("Insufficient quantity of " + name + " in stock.");
                }
                return;
            }
        }

        System.out.println("Item not found: " + name);
    }
    

    //The displayItems() Method Display The Full Inventory
    public void displayItems() {

        System.out.println("Wine Shop Inventory:\n");
        
        //Each Loops travers the ArrayLists and Prints Stock with Details

        System.out.println("Whiskeys:\n");
        for (Whiskey whiskey : whiskeys) {
            System.out.println("Name: " + whiskey.getName() + "| Type: " + whiskey.getType()
                    + "| Price: $" + whiskey.getPrice() + "| Quantity: " + whiskey.getQuantity());
        }

        System.out.println("\nWines:\n");
        for (Wine wine : wines) {
            System.out.println("Name: " + wine.getName() + "| Type: " + wine.getType()
                    + "| Price: $" + wine.getPrice() + "| Quantity: " + wine.getQuantity());
        }

        System.out.println("\nGins:\n");
        for (Gin gin : gins) {
            System.out.println("Name: " + gin.getName() + "| Type: " + gin.getType()
                    + "| Price: $" + gin.getPrice() + "| Quantity: " + gin.getQuantity());
        }

        System.out.println("\nVodkas:\n");
        for (Vodka vodka : vodkas) {
            System.out.println("Name: " + vodka.getName() + "| Type: " + vodka.getType()
                    + "| Price: $" + vodka.getPrice() + "| Quantity: " + vodka.getQuantity());
        }

        System.out.println("\nRums:\n");
        for (Rum rum : rums) {
            System.out.println("Name: " + rum.getName() + "| Type: " + rum.getType()
                    + "| Price: $" + rum.getPrice() + "| Quantity: " + rum.getQuantity());
        }

        System.out.println("\nBeers:\n");
        for (Beer beer : beers) {
            System.out.println("Name: " + beer.getName() + "| Type: " + beer.getType()
                    + "| Price: $" + beer.getPrice() + "| Quantity: " + beer.getQuantity());
        }
    }
}

public class WineShopApp {
    public static void main(String[] args) throws IOException{ //If any input error Occurs it throws an IO Exception
        WineShop shop = new WineShop();
        Scanner scanner = new Scanner(System.in);
        int choice;

        Display();  //Display The Welcome Massage 

        do {       //Options Available in the Inventory Menu 

            System.out.println("\nMenu:\n");
            System.out.println("1. Add Items\n");
            System.out.println("2. Count Items\n");
            System.out.println("3. Sell Items\n");
            System.out.println("4. Display All Items\n");
            System.out.println("5. Quit\n");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("\n");

            switch (choice) {  
                
                //Case 1 for Adding Items In Inventory
                case 1: {      
                    String name, alcoholType, subtype;
                    double price;
                    int quantity;

                    System.out.print("Enter item name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.print("Enter type of alcohol (Whiskey/Wine/Gin/Vodka/Rum/Beer): ");
                    alcoholType = scanner.next();

                    //If SubType of the Alcohol Available
                    if (alcoholType.equals("Whiskey")) {
                        System.out.print("Enter subtype (Malted/Scotch): ");
                        subtype = scanner.next();
                    } 
                    else if (alcoholType.equals("Wine")) {
                        System.out.print("Enter subtype (Red Wine/White Wine): ");
                        scanner.nextLine();
                        subtype = scanner.nextLine();
                    } else {
                        subtype = "";
                    }

                    System.out.print("Enter item price: ");
                    price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    quantity = scanner.nextInt();

                    shop.addItem(name, price, quantity, alcoholType, subtype);

                    break;
                }

                //Case 2 for Count Total Items
                case 2: {  
                    int count = shop.countItems();
                    System.out.println("Total items in stock: " + count);
                    break;
                }

                //Case 3 for Selling Items and Update the inventory
                case 3: {
                    String name;
                    int amount;
                    System.out.print("Enter item name to sell: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.print("Enter quantity to sell: ");
                    amount = scanner.nextInt();
                    shop.sellItem(name, amount);
                    break;
                }

                //Case 4 for Display The Full Inventory
                case 4: {
                    shop.displayItems();
                    break;
                }

                //Case 5 for Exit
                case 5:
                    System.out.println("Exiting program.\n\n");
                    break;

                //Default Input gives the chosies again
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);  //The While loop continues until 5 is pressed for exit

        scanner.close();
        
    }

    private static void Display() {
        System.out.println("######################################################");
        System.out.println("#############     Rahul's Wine Store     #############");
        System.out.println("######################################################");
        System.out.println("#     Whiskey   Vodka   Rum   Wine   Gin   Beers     #");
        System.out.println("######################################################");
    }
}
