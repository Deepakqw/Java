class operation {
    int square(int n) {
        return n * n;
    }
}

class circle {
    operation op = new operation();
    double pi = 3.14;

    double area(int radius) {
        int square = op.square(radius);
        return pi * square;
    }
}

public class Main {
    public static void main(String[] args) {
        circle c = new circle();
        double result = c.area(5);
        System.out.println(result);
    }
}