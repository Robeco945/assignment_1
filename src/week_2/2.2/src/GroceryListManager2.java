import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GroceryListManager2 {
    //private ArrayList<String> groceryList = new ArrayList<>();
    static Map<String, Double> groceryList = new HashMap<>();

    public static void addItem(String item, double price) {
        groceryList.put(item, price);
    }
    public static void removeItem(String item) {
        groceryList.remove(item);
    }
    public static Map<String,Double> displayList() {
        return groceryList;
    }
    public static boolean checkItem(String item) {
        boolean hasItem = groceryList.containsKey("banana");
        System.out.println("Does banana exist? " + hasItem);
        return hasItem;
    }
    public static double calculateTotalCost() {
        double totalPrice = 0;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            double price = entry.getValue();
            totalPrice += price;
            //System.out.println(item + "'s price: " + price);
        }
        //System.out.println("total price of all items: "+totalPrice);
        return totalPrice;
    }
    /*// Retrieve values
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);
        */



    public static void main(String[] args){
        GroceryListManager2 groceryListManager = new GroceryListManager2();
        GroceryListManager2.addItem("cabbage", 2.99);
        GroceryListManager2.addItem("carrot", 1.99);
        GroceryListManager2.addItem("candy cane",0.99);
        System.out.println("Grocery list: "+GroceryListManager2.displayList());
        GroceryListManager2.checkItem("banana");
        GroceryListManager2.removeItem("cabbage");
        System.out.println("Updated list: "+GroceryListManager2.displayList());
        System.out.println("total price of all items: "+GroceryListManager2.calculateTotalCost());

}}