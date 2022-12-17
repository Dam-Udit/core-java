class MethodOverloadingDemo {
    void demo() {
        System.out.println("No Parameters");
    }

    void demo(int a) {
        System.out.println("One parameter of int data type");
    }

    void demo(int x, int y) {
        System.out.println("Two parameters of int data type");
    }

    void demo(double d) {
        System.out.println("One parameter of double data type");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        obj.demo();
        obj.demo(1);
        obj.demo(1, 2);
        obj.demo(2.0);
    }
}
