import java.util.Scanner;

class Calc {
    int num1;
    int num2;

    Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int add() {
        return num1 + num2;
    }

    int subtract() {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }

    int divide() {
        return num1 / num2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        Calc c = new Calc(num1, num2);
        System.out.println("The sum is: " + c.add());
        System.out.println("The difference is: " + c.subtract());
        System.out.println("The product is: " + c.multiply());
        System.out.println("The quotient is: " + c.divide());
    }

}
