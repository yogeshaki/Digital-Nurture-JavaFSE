import java.util.*;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.print("Choose operation (+, -, *, /):");
        char c=s.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println((float)a+b);
                break;
            case '-':
                System.out.println((float)a-b);
                break;
            case '*':
                System.out.println((float)a*b);
                break;
            case '/':
                System.out.println((float)a/b);
                break;
            default:
                break;
        }
    }

}