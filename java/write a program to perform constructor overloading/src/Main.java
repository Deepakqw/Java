import java.util.Scanner;

class rst {
    rst(int a, int b) {
        int c = a + b;
        System.out.println("Sum of 2 numbers = " + c);
    }

    rst(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Sum of 3 numbers = " + d);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 3 values");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        rst r = new rst(a, b);
        rst r1 = new rst(a, b, c);
    }
}