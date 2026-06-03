public class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading s = new MethodOverloading();

        System.out.println("Sum of two integers: " + s.add(10, 20));
        System.out.println("Sum of two doubles: " + s.add(10.5, 20.5));
        System.out.println("Sum of three integers: " + s.add(10, 20, 30));
    }
}