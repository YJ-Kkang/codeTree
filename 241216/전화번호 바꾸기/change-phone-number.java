import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        String hyphen = "-";
        String oio = "010";

        System.out.println(oio + hyphen + num3 + hyphen + num2);
    }
}