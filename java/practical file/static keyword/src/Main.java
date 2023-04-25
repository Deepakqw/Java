class rst{
    static int count=0;
    rst(){
        count++;
        System.out.println(count);
    }
}
public class Main {
    public static void main(String[] args) {
        rst r1=new rst();
        rst r2=new rst();
        rst r3 =new rst();
    }
}