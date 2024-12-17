import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double sum = a + b;
        double difference = a - b;
        double result = sum / difference;

        System.out.printf("%.2f", result);
    }
}