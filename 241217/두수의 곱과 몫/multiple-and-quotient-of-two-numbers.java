import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;
        int quotient = a / b;

        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
    }
}