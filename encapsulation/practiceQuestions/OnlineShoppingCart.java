package encapsulation.practiceQuestions;

import java.util.ArrayList;
import java.util.List;

/*
 * Online Shopping Cart: Encapsulation in an online shopping cart application would 
 * involve defining a class for a shopping cart that encapsulates the items, 
 * quantities, and subtotal as private members and exposes methods for adding, 
 * removing and viewing items. This protects the internal state of the shopping 
 * cart and ensures that the cart's functionality is only accessed through the
 *  provided methods.
 */
public class OnlineShoppingCart {
    private String userName;
    private String itemName = "";
    private int itemQuantity = 0;
    private int subtotal = 0;
    private List<String> shoppingHistory;

    public OnlineShoppingCart(String userName){
        this.userName = userName;
        this.shoppingHistory = new ArrayList<>();
    }

    // methods for getting info
    public String getUserName(){ return this.userName; }
    public String getItemName(){ return this.itemName; }
    public int getItemQuantity() { return this.itemQuantity; }
    public int getSubtotal(){return this.subtotal; }
    public List<String> getShoppingHistory(){ return this.shoppingHistory; }

    // methods for  user behaviour 
    public void addCart(String itemName, int itemQuantity){
        if(!(this.itemName.equals(itemName))){
            this.itemName = this.itemName + " " + itemName;
        }
        else {
            this.itemName = itemName;
        }
        
        this.itemQuantity += itemQuantity;
        this.subtotal = 5 * itemQuantity;
        shoppingHistory.add("User name : " + userName);
        shoppingHistory.add("Item Name : " + itemName);
        shoppingHistory.add("Quantity : " + itemQuantity);
        shoppingHistory.add("Shopping price : " + subtotal);
    }

    public void reomveCart(String itemName, int itemQuantity){
        if(this.itemName.contains(itemName) && this.itemQuantity >= itemQuantity){
            this.itemQuantity -= itemQuantity;
            this.subtotal = 5 * itemQuantity;
        }
        else {
            System.out.println("Soryy, " + itemName + " has not been added to cart.");
        }
        
        shoppingHistory.add("User name : " + userName);
        shoppingHistory.add("Removed item Name : " + itemName);
        shoppingHistory.add("Removed quantity : " + itemQuantity);
        shoppingHistory.add("Redcued price : " + subtotal);
    }

    
}
