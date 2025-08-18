import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your weight in grams (g): ");
        double g = scanner.nextDouble();
        double l = g/13.28;
        double n = l/32;
        double lei = n/20;
        double nlei =  Math.floor(lei);//value in leiviskä rounded down
        double nn = Math.floor((g/13.28/32/20 - nlei)*20); //value of g in leiviska minus rounded value of leiviska to get the remainder,
                                                           // then *20 to convert to naula. rounded down to get remaining for luoti
        double nl = (((g/13.28/32/20 - nlei)*20) - nn)*32;
      //  System.out.println(g+" grams\n"+nl+" luoti \n"+nn+" naula\n"+lei+" leiviska\n"+nlei+" new leiviska\n"+g/13.28/32/20);
        System.out.printf(g+" grams is " + nlei + " leiviskä, " + nn);
        System.out.printf(" naula, and %6.2f", nl);
        System.out.println(" luoti.");

    }
}
