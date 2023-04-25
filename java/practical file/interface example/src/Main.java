interface firstinterface{
    public void firstmethod(); //interface method
}
interface secondinterface{
    public void secondmethod(); //interface method
}
class demo implements firstinterface,secondinterface{
    @Override
    public void firstmethod() {
        int x=100;
        System.out.println("value of first "+ x);
    }
    @Override
    public void secondmethod() {
        int x=200;
        System.out.println("value of second "+ x);
    }
}
public class Main {
    public static void main(String[] args) {
        demo myobj=new demo();
        myobj.firstmethod();
        myobj.secondmethod();
    }
}