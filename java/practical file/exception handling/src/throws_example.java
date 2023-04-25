class rst{
    int division(int a,int b) throws ArithmeticException{ //throws example
        int t=a/b;
        return t;
    }
}
public class throws_example{
    public static void main(String[] args){
        rst obj=new rst();
        try {
            System.out.println(obj.division(15,0));
        }
        catch (ArithmeticException e){
            System.out.println("You shouldn't divide number by zero");
        }
    }
}
