import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int width = sc.nextInt();
        int length = sc.nextInt();

        width = width + 8;
        length = length * 3;
        int area = width * length;

        System.out.println(width);
        System.out.println(length);
        System.out.println(area);
    }
}