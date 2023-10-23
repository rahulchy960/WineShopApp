UNIVERSITY PROJECT 

# WineShopApp
The Wine Shop Inventory Management System is a program that allows the management of alcoholic beverage items within a wine shop. It provides functionality to add new items, track the quantity and types of alcoholic beverages, sell items, count the total number of items in stock, and display the current inventory.

## Features
1. **Add Items**: This feature allows the user to add new alcoholic beverage items to the inventory. The user can specify the item's name, type of alcohol (Whiskey, Wine, Gin, Vodka, Rum, or Beer), price, quantity, and subtype (if applicable).

2. **Count Items**: This feature provides the total count of items in the inventory, considering all types of alcoholic beverages.

3. **Sell Items**: Users can sell alcoholic beverage items by specifying the item name and the quantity to be sold. If the requested quantity is available in the inventory, the program processes the sale and provides information about the sold items and the total revenue generated.

4. **Display All Items**: This feature displays the current inventory of alcoholic beverages, categorized by their types (e.g., Whiskeys, Wines, Gins, Vodkas, Rums, Beers). It shows details such as the name, type, price, and quantity of each item.

5. **User-Friendly Menu**: The program presents a user-friendly menu to guide users through the available options, making it easy to navigate and interact with the system.

## Usage
1. **Add Items**:
   - To add a new item, select option 1 from the main menu.
   - Enter the item's name, type of alcohol, subtype (if applicable), price, and quantity.
   - The program will validate the input and add the item to the inventory if it meets the criteria.

2. **Count Items**:
   - To count the total number of items in stock, select option 2 from the main menu.
   - The program will display the total item count.

3. **Sell Items**:
   - To sell items, select option 3 from the main menu.
   - Enter the name of the item to be sold and the quantity to sell.
   - The program will check if the requested quantity is available in stock and process the sale if possible, providing information about the sale and revenue generated.

4. **Display All Items**:
   - To view the current inventory, select option 4 from the main menu.
   - The program will display a categorized list of alcoholic beverage items, including their names, types, prices, and quantities.

5. **Exit**:
   - To exit the program, select option 5 from the main menu.

## Code Structure
The program is structured using object-oriented principles and includes the following classes:

- AlcoholicBeverage: A base class for alcoholic beverages, containing common attributes and methods.
- Derived classes for specific types of alcoholic beverages, such as Whiskey, Wine, Gin, Vodka, Rum, and Beer.
- WineShop: A class that manages the wine shop's inventory and provides methods for adding items, counting items, selling items, and displaying the inventory.

## How to Run
1. Compile the program .
2. Run the compiled executable.
3. Follow the on-screen menu prompts to interact with the program.

## Conclusion
The Wine Shop Inventory Management System is a useful tool for managing and tracking alcoholic beverage items within a wine shop. It simplifies tasks such as adding new items, monitoring inventory levels, selling items, and displaying the current stock. This program can be extended and customized to meet the needs of a real-world wine shop or similar business.
