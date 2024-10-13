//plan: take input number (scanner)
// take choice (like currencyconverter) (multiplication, addition, substraction)
//take second input number
//use switch to make them do the chosen action
//
//find ways to improve the code
import java.util.Scanner;

public class simpleCalculator {
    private static final int ADDITION = 0;
    private static final int SUBTRACTION = 1;
    private static final int MULTIPLICATION = 2;
    private static final int DIVISION = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting inputs from user
        int firstNumber = getFirstNumberInput(scanner);
        int choice = displayOperationOptions(scanner);
        int secondNumber = getSecondNumberInput(scanner);

        //Performing calculation based on choice
        calculate(firstNumber, secondNumber, choice);
    }

    //Method to get first number input from user
    private static int getFirstNumberInput(Scanner scanner) {
        System.out.println("Please input the first number of your calculation");
        return scanner.nextInt();
    }

    //Method to get the user's choice of operation
    private static int displayOperationOptions(Scanner scanner) {
        System.out.println("Choose from the following actions");
        System.out.println("type '0' for addition");
        System.out.println("type '1' for subtraction");
        System.out.println("type '2' for multiplication");
        System.out.println("type '3' for division");
        return scanner.nextInt();
    }

    //Method to get second number input from user
    private static int getSecondNumberInput(Scanner scanner) {
        System.out.println("Please input the second number of your calculation");
        return scanner.nextInt();
    }

    private static void calculate(int firstNumber, int secondNumber, int choice) {
        switch (choice) {
            case ADDITION:
                System.out.println("Your result is " + (firstNumber + secondNumber));
                break;
            case SUBTRACTION:
                System.out.println("Your result is " + (firstNumber - secondNumber));
                break;
            case MULTIPLICATION:
                System.out.println("Your result is " + (firstNumber * secondNumber));
                break;
            case DIVISION:
                if (secondNumber != 0){
                    System.out.println("Your result is " +(firstNumber / secondNumber));
                } else {
                    System.out.println("Division by zero is not possible.");
                }
                break;
            default:
                System.out.println("Invalid operation choice");
                break;
        }
    }
}

