import java.util.Scanner;
public class prime {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start = Integer.parseInt((scanner.nextLine()));
        System.out.println("Enter the ending number (must be larger than the starting number");
        int end = Integer.parseInt((scanner.nextLine()));
        while (end <= start) {
            System.out.println("please enter a number that is larger than the staring number");
            end = Integer.parseInt((scanner.nextLine()));
            if (end > start) {
                break;
            }
        }
        for (int n = start - 1; n <= end; n++) {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i != 0) {
                    System.out.println(n);
                    //System.out.println("i "+i);
                    break;


            }

        }
    }
}}


  /*for (int i = 2; i <= number - 1; i ++ ){
        if (number % i == 0){
            System.out.println(number + " is not a prime number");
        }
        else {System.out.println(number + " is an alpha male wolf");
    }}
}}*/






