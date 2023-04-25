class rst1{
    int count=0;
    rst1(){
        count++;
        System.out.println(count);
    }
}
class without {
    public static void main(String[] args) {
        rst1 r1=new rst1();
        rst1 r2=new rst1();
        rst1 r3=new rst1();
    }
}