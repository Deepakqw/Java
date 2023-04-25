import java.io.*;
class example_throw{
    void mymethod(int num) throws ArithmeticException ,NullPointerException{ //multiple throw
        if (num==1)
            throw new ArithmeticException("Arithmetic exception occured");
        else
            throw new NullPointerException("NullPointerException occured");
    }
}
public class throw_exmple {
    public static void main(String[] ars){
        try {
            example_throw obj = new example_throw();
            obj.mymethod(2);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
