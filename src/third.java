import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        double second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        double third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is: " + (first + second + third));
        System.out.println("the product of the numbers is:" + (first*second*third));
        System.out.println("The avg of the numbers is: " + ((first + second + third)/3));
    }
}
/*The avg was returning as 4 instead of 4.3333
so i made the inputs into doubles so that the output is not rounded
 */