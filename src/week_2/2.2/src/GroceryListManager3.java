import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GroceryListManager3 {
    //private ArrayList<String> groceryList = new ArrayList<>();
    static Map<String, Double> groceryList = new HashMap<>();

    public static void addItem(String item, double price, String category) {
        groceryList.put(item, price, category);
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
        GroceryListManager3 groceryListManager = new GroceryListManager3();
        GroceryListManager3.addItem("cabbage", 2.99, vegetable);
        GroceryListManager3.addItem("carrot", 1.99, vegetable);
        GroceryListManager3.addItem("candy cane",0.99, candy);
        System.out.println("Grocery list: "+GroceryListManager3.displayList());
        GroceryListManager3.checkItem("banana");
        GroceryListManager3.removeItem("cabbage");
        System.out.println("Updated list: "+GroceryListManager3.displayList());
        System.out.println("total price of all items: "+GroceryListManager3.calculateTotalCost());

    }}