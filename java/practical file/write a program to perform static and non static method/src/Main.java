class Main{
    void fun(){
        System.out.println("non-static method");
    }
    static void fun1(){
        System.out.println("static method");
    }
    public static void main(String[] args){
        Main r=new Main();
        r.fun();
        fun1();
    }
}