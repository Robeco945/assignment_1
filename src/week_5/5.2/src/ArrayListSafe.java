import java.util.ArrayList;

public class ArrayListSafe<E> {
    private final ArrayList<E> list = new ArrayList<>();

    public synchronized void add(E number) {
        list.add(number);
    }

    public synchronized void remove(E number) {
        list.remove(number);
    }

    public synchronized int size() {
        return list.size();
    }

    public void showList() {
        for (E i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] arg) {
        ArrayListSafe<Integer> slist = new ArrayListSafe<>();
        slist.add(10);
        slist.add(20);
        slist.add(30);

        slist.remove(20);

        System.out.println("Size: " + slist.size()); 

        slist.showList(); 
    }
}