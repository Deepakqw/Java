import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter first number");
        a=s.nextInt();
        System.out.println("enter second number");
        b=s.nextInt();
        System.out.println("enter third number");
        c=s.nextInt();
        if (a==b && a==c)
        {
            System.out.println("all are equal");
        }
        else if (a>b && a>c)
        {
            System.out.println("first value is greatest");
        }
        else if (b>c)
        {
            System.out.println("second value is greatest");
        }
        else
        {
            System.out.println("third value is greatest");
        }
    }
}