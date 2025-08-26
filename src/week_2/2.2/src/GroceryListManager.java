import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void displayList() {
        System.out.println("Groceries: "+groceryList);
    }
    public boolean checkItem(String item) {
        boolean dupe = false;
        for (int i = 0; i < groceryList.size(); i++) {
                if (groceryList.get(i).equals(item)) {
                    dupe = true;
                    break;
                }
        }
        System.out.println("Is "+item+" in the list? " + dupe);
        return dupe;
    }
public static void main(String[] args){
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("cabbage");
        groceryListManager.addItem("carrot");
        groceryListManager.addItem("candy cane");
        groceryListManager.displayList();
        groceryListManager.checkItem("banana");
        groceryListManager.removeItem("cabbage");
        {System.out.println("Updated list: ");}
        groceryListManager.displayList();
}
}