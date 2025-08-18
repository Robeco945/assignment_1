import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your temperature in fahrenheit ");
        double tempF = Integer.parseInt(scanner.nextLine());

        System.out.println("Temp in Celsius: " + (tempF - 32)*5/9);
    }
}