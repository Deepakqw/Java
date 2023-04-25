import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter username");
        String un=input.nextLine();
        System.out.println("enter Number");
        int a=input.nextInt();
        System.out.println("enter double");
        double b= input.nextDouble();
        System.out.println("username = " + un);
        System.out.println("number is  = " + a);
        System.out.println("double number is = " + b/3);
    }
}