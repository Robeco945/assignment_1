public class Calculator {
    public int add(int a, int b) {
        //use try catch instead of throw new IllegalArgumentException
        try {
            if (b < 0) {
                throw new IllegalArgumentException("b must be non-negative");

            }
            else if (a < 0) {
                throw new IllegalArgumentException("a must be non-negative");

            }
            else if (a + b > 0){
                return a + b;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("erro");
            return 0;

        }
        return a + b;
    }
    public int calculatorToZero(){
        return 0;
    }
    //A method that adds an integer to the calculator.
    public int addToCalculator(int a){
        return a;
    }
    //A method that returns the current value of the calculator.
    public int getCurrentValue(int a){
        return a;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3)); // Outputs: 8
        System.out.println(calculator.add(5, -7)); // Outputs: erro
        System.out.println(calculator.calculatorToZero()); // Outputs: 0
        System.out.println(calculator.addToCalculator(10)); // Outputs: 10
        System.out.println(calculator.getCurrentValue(10)); // Outputs: 10
    }
}
