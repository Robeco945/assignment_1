import java.util.Scanner;
public class binary {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a binary: ");
        String bina = (scanner.nextLine());
        int i = bina.length();
        double deci = 0;
        int count = 0;

        for (int j = i-1; j>=0 ;j--) {
            char chara = bina.charAt(count);
            int number = chara - '0';
            double decimal = (number*(Math.pow(2,j)));
            //System.out.println("char:"+ chara);
            //System.out.println("dec:"+ decimal);
            //System.out.println("j:"+ j);
            //System.out.println("count:"+ count);
            //System.out.println();
            deci += decimal;
            count ++;
            //System.out.println("number: "+ number);
            //System.out.println("i: "+ i);
        }
System.out.println("real decimal: " + deci);
        }
    }
