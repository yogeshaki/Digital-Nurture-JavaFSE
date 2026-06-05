public class TypeCastingExample {
    public static void main(String[] args) {

        double d = 25.75;
        int i = (int) d;

        int num = 100;
        double d2 = (double) num;

        System.out.println("Double Value: " + d);
        System.out.println("After casting to int: " + i);

        System.out.println("Integer Value: " + num);
        System.out.println("After casting to double: " + d2);
    }
}