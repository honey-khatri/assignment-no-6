import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no1: ");
        int a = sc.nextInt();

        System.out.print("Enter no2: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println("Division = " + (a / b));
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }

        sc.close();
    }
}
