import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpression {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Yogesh");
        names.add("Hari");
        names.add("Karthik");
        names.add("Arun");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted Names:");

        for(String name : names) {
            System.out.println(name);
        }
    }
}