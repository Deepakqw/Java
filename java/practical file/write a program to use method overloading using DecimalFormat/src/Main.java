import java.text.DecimalFormat;
public class Main {
    static int fun(int x,int y){
        return x+y;
    }
    static double fun(double x,double y){
        return x+y;
    }
    public static void main(String[] args) {
        DecimalFormat d=new DecimalFormat("#.###");
        int m=fun(4,56);
        double m2=fun(4.502,54.84);
        System.out.println("int = "+m);
        System.out.println("double = "+m2);
        System.out.println("DecimalFormat = "+d.format(m2));
    }
}