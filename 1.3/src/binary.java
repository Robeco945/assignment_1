import java.util.Scanner;
public class binary {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me a binary: ");
        String bina = (scanner.nextLine());
        int i = bina.length();
        while (i>=0) {
            int j = Integer.parseInt(String.valueOf(bina.charAt(i-1)));

            //int decimal =
            System.out.println("i: "+i);
            System.out.println("j:"+j);
            i--;
        }


        }
    }
