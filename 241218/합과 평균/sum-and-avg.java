import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf((a + b) + " %.1f", ((double)a + b) / 2);
    }
}

/*
다른 방법:
double avr = ((double) a + b) / 2;에서 double 생략하면
전체 계산 값이 3이 된 다음에 double type(값: 3.0)으로 나오는 것이기에 원하는 것과 다른 결과가 나옴!
*/
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a + b;
//         double avr = ((double) a + b) / 2;

//         System.out.printf(sum + " %.1f", avr);
//     }
// }