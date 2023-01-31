package encapsulation.practiceQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private String userName;
    private Map<String, Integer> items;
    private int subtotal;
    private List<String> shoppingHistory;

    public ShoppingCart(String userName){
        this.userName = userName;
        this.items = new HashMap<>();
        this.shoppingHistory = new ArrayList<>();
    }

    public String getUserName(){
        return this.userName;
    }

    public Map<String, Integer> getItems() {
        return this.items;
    }

    public int getSubtotal(){
        return this.subtotal;
    }

    public List<String> getShoppingHistory(){
        return this.shoppingHistory;
    }

    public void addCart(String itemName, int itemQuantity, int price){
        if (items.containsKey(itemName)) {
            // if items already in cart then add it with previous value
            items.put(itemName, items.get(itemName) + itemQuantity);
        } else {
            // otherwise, add only new value
            items.put(itemName, itemQuantity);
        }

        this.subtotal += price * itemQuantity;
        shoppingHistory.add("User name: " + userName);
        shoppingHistory.add("Item Name: " + itemName);
        shoppingHistory.add("Quantity: " + itemQuantity);
        shoppingHistory.add("Shopping price: " + subtotal);
    }

    public void removeCart(String itemName, int itemQuantity, int price){
        if (items.containsKey(itemName) && items.get(itemName) >= itemQuantity) {
            // if items already in cart then subtract it

            items.put(itemName, items.get(itemName) - itemQuantity);
            this.subtotal -= price * itemQuantity;

            shoppingHistory.add("User name: " + userName);
            shoppingHistory.add("Removed item Name: " + itemName);
            shoppingHistory.add("Removed quantity: " + itemQuantity);
            shoppingHistory.add("Reduced price: " + subtotal);
        } else {
            System.out.println("Sorry, " + itemName + " has not been added to the cart or there are not enough items to remove.");
        }
    }

    public void viewCart() {
        System.out.println("User: " + userName);
        System.out.println("Items in cart: ");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
        System.out.println("Subtotal: " + subtotal);
        
    }
}
