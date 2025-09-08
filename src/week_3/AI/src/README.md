the program is a basic calculator java program which sums and returns positive integers, it will show an error if the sum is negative. it also has a function where it can return the calculator to 0
# Basic Calculator Program
This is a simple calculator program that sums two positive integers. If the result is negative, it will display an error message.
## Features


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
1. The `add` method takes two integers, `a` and `b`, as input.
2. It checks if either `a` or `b` is negative. If so, it throws an `IllegalArgumentException`.
3. If both integers are non-negative, it returns their sum.
4. If an exception is caught, it prints "erro" and returns 0.
5. The program ensures that only positive integers are summed, and handles errors gracefully.- Sums two positive integers
- Returns an error message if the sum is negative
- Resets the calculator to zero


    public int calculatorToZero(){
    return 0;
    }

    public int addToCalculator(int a){
    return a;
    }

    public int getCurrentValue(int a){
    return a;
    }
expplanation of the code:
1. The `calculatorToZero` method resets the calculator to zero by returning 0.
2. The `addToCalculator` method takes an integer `a` and returns it, simulating adding it to the calculator.
3. The `getCurrentValue` method takes an integer `a` and returns it, simulating retrieving the current value of the calculator.
4. These methods provide basic functionality for a calculator, allowing it to reset, add values, and retrieve the current