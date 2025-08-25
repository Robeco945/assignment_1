import java.util.Scanner;
import java.util.Random;
public class name_generator {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Random name generator ");
        System.out.print("How many names? ");
        int size = scanner.nextInt();
        String[] first = {"John", "Adam", "Roberto","Jesus","Tran"};
        String[] last = {" Smith"," Caretto"," Stewart"," Nguyen"," Alvarez"};
        int my_name_counter = 0;
        for (int i = 0; i < size; i++) {
            int ran1 = r.nextInt(5);
            int ran2 = r.nextInt(5);
            String generated_names = (first[ran1]+last[ran2]);
            if (generated_names.equals("Roberto Caretto")) {my_name_counter ++;}
            System.out.println(generated_names);
        }
        System.out.println("times my name appeared: "+my_name_counter);
    }
}
