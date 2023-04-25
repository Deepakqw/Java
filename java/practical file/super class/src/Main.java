class animal {
    String color = "white";

    void eat() {
        System.out.println("eating....");
    }

    animal() {
        System.out.println("animal is created");
    }
}

class dog extends animal {
    String color = "black";

    dog() {
        super();  //super constructor or animal constructor
        System.out.println("dog is created");
    }

    void printcolor() {
        System.out.println(color); //prints color of dog class
        System.out.println(super.color); //prints color of animal class
    }

    void eat() {
        System.out.println("eating bread....");
    }

    void bark() {
        System.out.println("barking....");
    }

    void work() {
        super.eat();  //super method
        bark();
    }
}

public class Main {
    public static void main(String[] args) {
        dog d = new dog();
        d.printcolor();
        d.work();
    }
}