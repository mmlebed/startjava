public class Calculator {

    public static void main(String[] args) {
        //TODO +, -, *, /, ^, %

        int firstNumber = 2;
        int secondNumber = 0;
        char mathOperation = '^';

        if (mathOperation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (mathOperation == '^') {
            int result = 1;
            for (int i = 0; i < secondNumber; i++) {
                result = result * firstNumber;
            }
            System.out.println(result);
        } else if (mathOperation == '%') {
            System.out.println(firstNumber % secondNumber);
        }
    }
}