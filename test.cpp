#include<bits/stdc++.h>
using namespace std;

// Base class for alcoholic beverages
class Alcohol{
public:
    Alcohol(const string name, double price, int quantity)
        : name(name), price(price), quantity(quantity) {}

    string getName() const{
        return name;
    }

    double getPrice() const{
        return price;
    }

    int getQuantity() const{
        return quantity;
    }

    void addQuantity(int amount){
        quantity += amount;
    }

    bool sell(int amount){
        if (amount <= quantity){
            quantity -= amount;
            return true;
        }
        return false;
    }

private:
    string name;
    double price;
    int quantity;
};

// Whiskey class, derived from AlcoholicBeverage
class Whiskey : public Alcohol{
public:
    Whiskey(const string name, double price, int quantity, const string type)
        : Alcohol(name, price, quantity), type(type) {}

    string getType() const{
        return type;
    }

private:
    string type; // Scotch or Malted
};

// Wine class, derived from AlcoholicBeverage
class Wine : public Alcohol{
public:
    Wine(const string name, double price, int quantity, const string type)
        : Alcohol(name, price, quantity), type(type){}

    string getType() const{
        return type;
    }

private:
    string type; // Red Wine or White Wine
};

class Gin : public Alcohol{
public:
    Gin(const string name, double price, int quantity)
        : Alcohol(name, price, quantity) {}

    string getType() const {
        return "Gin";
    }
};

class Vodka : public Alcohol{
public:
    Vodka(const string name, double price, int quantity)
        : Alcohol(name, price, quantity) {}

    string getType() const{
        return "Vodka";
    }
};

class Rum : public Alcohol{
public:
    Rum(const string& name, double price, int quantity)
        : Alcohol(name, price, quantity) {}

    string getType() const{
        return "Rum";
    }
};

class Beer : public Alcohol{
public:
    Beer(const string& name, double price, int quantity)
        : Alcohol(name, price, quantity){}

    string getType() const{
        return "Beer";
    }
};

class WineShop{
    private:
        vector<Whiskey> whiskeys;
        vector<Wine> wines;
        vector<Gin> gins;
        vector<Vodka> vodkas;
        vector<Rum> rums;
        vector<Beer> beers;
public:
    void addItem(const string &name, double price, int quantity, const string &alcoholType, const string &subtype = ""){
        if(alcoholType == "Whiskey"){
            if(subtype == "Malted" || subtype == "Scotch") {
                whiskeys.push_back(Whiskey(name, price, quantity, subtype));
            } 
            else{
                cout<<"Invalid Whiskey subtype: "<<subtype<<". Item not added."<<endl;
            }
        } 
        else if(alcoholType == "Wine") {
            if(subtype == "Red Wine" || subtype == "White Wine") {
                wines.push_back(Wine(name, price, quantity, subtype));
            } 
            else{
                cout<<"Invalid Wine subtype: "<<subtype<< ". Item not added."<<endl;
            }
        } 
        else if(alcoholType == "Gin"){
            gins.push_back(Gin(name, price, quantity));
        } 
        else if(alcoholType == "Vodka"){
            vodkas.push_back(Vodka(name, price, quantity));
        } 
        else if(alcoholType == "Rum"){
            rums.push_back(Rum(name, price, quantity));
        } 
        else if(alcoholType == "Beer"){
            beers.push_back(Beer(name, price, quantity));
        } 
        else {
            cout<<"Invalid type of alcohol: "<<alcoholType<< ". Item not added." << endl;
        }
    }

    int countItems() const{
        return whiskeys.size() + wines.size() + gins.size() + vodkas.size() + rums.size() + beers.size();
    }

    void sellItem(const string &name, int amount){
        for(auto &whiskey : whiskeys){
            if(whiskey.getName() == name){
                if(whiskey.sell(amount)){
                    cout<<"Sold "<<amount<<" "<<name<<" for $"<<whiskey.getPrice() * amount<<endl;
                } 
                
                else{
                    cout<<"Insufficient quantity of "<<name<<" in stock."<<endl;
                }
                return;
            }
        }

        for(auto &wine : wines){
            if(wine.getName() == name){
                if (wine.sell(amount)){
                    cout<< "Sold "<<amount<<" "<<name<<" for $"<< wine.getPrice() * amount<<endl;
                } 
                else {
                    cout<<"Insufficient quantity of "<<name<<" in stock."<<endl;
                }
                return;
            }
        }

        for(auto &gin : gins){
            if(gin.getName() == name){
                if(gin.sell(amount)){
                    cout<<"Sold "<<amount<<" "<<name<<" for $"<<gin.getPrice() * amount<<endl;
                } 
                else{
                    cout<<"Insufficient quantity of "<<name<<" in stock."<<endl;
                }
                return;
            }
        }

        for(auto &vodka : vodkas){
            if(vodka.getName() == name){
                if(vodka.sell(amount)){
                    cout<<"Sold "<<amount<<" "<<name<<" for $"<<vodka.getPrice() * amount<<endl;
                } 
                else{
                    cout<<"Insufficient quantity of "<<name<<" in stock."<<endl;
                }
                return;
            }
        }

        for(auto &rum : rums){
            if(rum.getName() == name){
                if(rum.sell(amount)){
                    cout<<"Sold "<<amount<<" "<<name<<" for $"<<rum.getPrice() * amount<<endl;
                } 
                else{
                    cout<<"Insufficient quantity of "<< name <<" in stock."<<endl;
                }
                return;
            }
        }

        for(auto &beer : beers){
            if(beer.getName() == name){
                if(beer.sell(amount)){
                    cout<<"Sold "<<amount<<" "<<name<<" for $"<<beer.getPrice() * amount<<endl;
                } 
                else{
                    cout<<"Insufficient quantity of "<<name<<" in stock."<<endl;
                }
                return;
            }
        }

        cout<<"Item not found: "<<name<<endl;
    }

    void displayItems() const {
        cout<< "Wine Shop Inventory:"<<endl;

        cout<< "\nWhiskeys:" << endl;
        for(const auto whiskey : whiskeys) {
            cout<< "Name: " << whiskey.getName() << "| Type: " << whiskey.getType()
                << "| Price: $" << whiskey.getPrice() << "| Quantity: " << whiskey.getQuantity() << endl;
        }

        cout<< "\nWines:" << endl;
        for(const auto wine : wines){
            cout << "Name: " << wine.getName() << "| Type: " << wine.getType()
                 << "| Price: $" << wine.getPrice() << "| Quantity: " << wine.getQuantity() << endl;
        }

        cout<< "\nGins:" <<endl;
        for(const auto gin : gins){
            cout<< "Name: " << gin.getName() << "| Type: " << gin.getType()
                 << "| Price: $" << gin.getPrice() << "| Quantity: " << gin.getQuantity() << endl;
        }

        cout<< "\nVodkas:" << endl;
        for(const auto vodka : vodkas){
            cout<< "Name: " << vodka.getName() << "| Type: " << vodka.getType()
                << "| Price: $" << vodka.getPrice() << "| Quantity: " << vodka.getQuantity() << endl;
        }

        cout<< "\nRums:" <<endl;
        for(const auto rum : rums){
            cout<< "Name: " << rum.getName() << "| Type: " << rum.getType()
                << "| Price: $" << rum.getPrice() << "| Quantity: " << rum.getQuantity() << endl;
        }

        cout<< "\nBeers:" << endl;
        for(const auto beer : beers){
            cout << "Name: " << beer.getName() << "| Type: " << beer.getType()
                 << "| Price: $" << beer.getPrice() << "| Quantity: " << beer.getQuantity() << endl;
        }
    }


};

void Display(){
    cout<<"######################################################"<<endl;
    cout<<"#############     Rahul's Wine Store     #############"<<endl;
    cout<<"######################################################"<<endl;
    cout<<"#     Whiskey   Vodka   Rum   Wine   Gin   Beers     #"<<endl;
    cout<<"######################################################"<<endl;
}

int main() {
    WineShop shop;
    int choice;
    Display();
    do {
        cout<<"\nMenu:\n";
        cout<<"1. Add Items\n";
        cout<<"2. Count Items\n";
        cout<<"3. Sell Items\n";
        cout<<"4. Display All Items\n";
        cout<<"5. Quit\n";
        cout<<"Enter your choice: ";
        cin>>choice;
        cout<<"\n"<<"\n";

        switch(choice){
            case 1:{
                string name, alcoholType, subtype;
                double price;
                int quantity;

                cout<< "Enter item name: ";
                cin.ignore();
                getline(cin,name);
                cout<<"Enter type of alcohol (Whiskey/Wine/Gin/Vodka/Rum/Beer): ";
                cin>>alcoholType;

                if(alcoholType == "Whiskey"){
                    cout << "Enter subtype (Malted/Scotch): ";
                    cin >> subtype;
                } 
                else if(alcoholType == "Wine"){
                    cout<<"Enter subtype (Red Wine/White Wine): ";
                    cin.ignore();
                    getline(cin,subtype);
                }

                cout<<"Enter item price: ";
                cin>>price;
                cout<<"Enter item quantity: ";
                cin>>quantity;

                shop.addItem(name, price, quantity, alcoholType, subtype);

                break;
            }
            case 2:{
                int count = shop.countItems();
                cout<<"Total items in stock: "<<count<<endl;
                break;
            }
            case 3:{
                string name;
                int amount;
                cout<<"Enter item name to sell: ";
                cin.ignore();
                getline(cin,name);
                cout<<"Enter quantity to sell: ";
                cin>>amount;
                shop.sellItem(name, amount);
                break;
            }
            case 4:{
                shop.displayItems();
                break;
            }
            case 5:
                cout<<"Existing program." <<"\n\n"<< endl;
                break;
            default:
                cout<<"Invalid choice. Please try again."<<endl;
        }
    }while(choice != 5);

    return 0;
}
