import java.util.Scanner;
public class CoffeeMakerDriver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CoffeeMaker myCoffee = new CoffeeMaker();

        myCoffee.onOff();
        System.out.println("Coffee maker is "+myCoffee.getOnOff());

        System.out.println("Select coffee type: enter 1 for normal or enter 2 for espresso");
        int type = scanner.nextInt();
        if (type == 2 ) {
            myCoffee.setCoffeeType("espresso");
        }
        else {myCoffee.setCoffeeType("normal");
        }
        int amount = 0;
        while (amount < 10 || amount > 80){
            System.out.println("Choose coffee amount (10-80ml)");
            amount = scanner.nextInt();
            myCoffee.setCoffeeAmount(amount);
        }

        System.out.println("Coffee type is "+myCoffee.getCoffeeType());
        System.out.println("Coffee amount is "+myCoffee.getCoffeeAmount()+"ml");
        myCoffee.onOff();
        System.out.println("Coffee maker is "+myCoffee.getOnOff());
    }
}
