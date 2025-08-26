import java.util.Scanner;
public class quadratic {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first variable 'a' for the quadratic formula");
        int a = Integer.parseInt(scanner.nextLine());
        while (a == 0) {
                System.out.println("'a' can not be 0");
                System.out.println("re-enter the first variable 'a' for the quadratic formula");
                a = Integer.parseInt(scanner.nextLine());
                if (a!=0) {break;}
        }
        System.out.println("enter the second variable 'b' for the quadratic formula");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("enter the third variable 'c' for the quadratic formula");
        int c = Integer.parseInt(scanner.nextLine());
        double x1 = ((b*-1)+Math.sqrt(b*b-4*a*c))/2*a;
        double x2 = ((b*-1)-Math.sqrt(b*b-4*a*c))/2*a;
            if ((b*b-4*a*c) < 0) {
                System.out.println("No real roots");
            }
            else {System.out.printf("The roots of the equation is: x1 = %6.2f" , x1);
                  System.out.printf(", x2 = %6.2f" , x2);
            }

    }
}
