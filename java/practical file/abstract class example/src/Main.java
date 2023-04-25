abstract class bike{
    abstract void run();
     final void fun(){ //method using final keyword cannot be override
        System.out.println("final without abstract keyword");
    }
}
class rst extends bike{
    void run() {
        System.out.println("running safely");
    }
}
public class Main {
    public static void main(String[] args) {
        rst obj=new rst();
        obj.run();
        obj.fun();
    }
}