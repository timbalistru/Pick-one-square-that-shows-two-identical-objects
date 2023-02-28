public class Operations {
    public static void printAritmeticOperations() {
        int a = 10, b = 4;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int quotient = a % b;

        System.out.println("\n" + "Arithmetic operations:");
        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Quatient = " + quotient);
    }

    public static void printLogicOperations() {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("\n" + "Logic operations:");
        System.out.println("AND = " + (b1 && b2));
        System.out.println("OR = " + (b1 || b2));
        System.out.println("NOT = " + (!b2));
    }

    public static void printRelationalOperations() {
        int firstNumber = 10;
        int secondNumber = 5;

        System.out.println("\n" + "Relational Operations: ");
        System.out.println("Equal to: " + (firstNumber == secondNumber));
        System.out.println("Not Equal to: " + (firstNumber != secondNumber));
        System.out.println("Greater than: " + (firstNumber > secondNumber));
        System.out.println("Less than: " + (firstNumber < secondNumber));
        System.out.println("Greater than or equal to: " + (firstNumber >= secondNumber));
        System.out.println("Less than or equal to: " + (firstNumber <= secondNumber));
    }

    public static void useForAndWhile() {
        int i = 0;
        System.out.println("\n" + "WHILE:");
        while (i < 10) {
            System.out.println("Using while loop: " + i);
            i++;
        }

        System.out.println("\n" + "FOR:");
        for (int j = 0; j < 10; j++) {
            System.out.println("Using for loop: " + j);
        }
    }
}
