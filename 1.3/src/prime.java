import java.util.Scanner;
public class prime {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start = Integer.parseInt((scanner.nextLine()));
        System.out.println("Enter the ending number (must be larger than the starting number");
        int end = Integer.parseInt((scanner.nextLine()));
        while (end<=start){
            System.out.println("please enter a number that is larger than the staring number");
            end = Integer.parseInt((scanner.nextLine()));
            if (end > start){
                break;
            }
        }
        int n = start;
        while (n <= end) {

            n++;
        }
    }
}
