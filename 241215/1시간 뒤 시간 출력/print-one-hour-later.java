import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter(":");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int numPlus = num1 + 1;

        System.out.print(numPlus + ":" + num2);
    }
}