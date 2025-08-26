import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first leg of the triangle:");
        double a = Integer.parseInt(scanner.nextLine());

        System.out.println("enter the second leg of the triangle:");
        double b = Integer.parseInt(scanner.nextLine());

        System.out.println("The hypotenuse of your triangle is: " + (Math.sqrt(a * a + b * b)));
    }
}
