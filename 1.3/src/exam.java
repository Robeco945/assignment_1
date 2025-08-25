import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Multiplication exam");
        while (score < 10) {
            for (int i = 1; i < 11; i++) {
                int number = (int) (Math.random() * 10) + 1;
                int number2 = (int) (Math.random() * 10) + 1;
                System.out.println(i + ": " + number + "*" + number2 + "=");
                int answer = Integer.parseInt((scanner.nextLine()));
                if (answer == number * number2) {
                    score++;
                }
            }
            if (score == 10) {
                System.out.println("Congratulations, you got them all right");
            } else {
                System.out.println("Oops, you only got " + score + " correct. Lets try again.");
                score = 0;
            }
        }
    }
}
