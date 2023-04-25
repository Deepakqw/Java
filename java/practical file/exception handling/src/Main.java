import java.util.Scanner;

public class Main {
    static void validate(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("NOT VALID");
            else
                System.out.println("Welcome to vote");
        } catch (Exception e) {
            System.out.println("Welcome");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        validate(a);
        System.out.println("Rest of the code.....");
    }
}