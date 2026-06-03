import java.util.*;
public class LeapYearChecker{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int a=s.nextInt();
        if (a%4==0&&a%100!=0||a%400==0) {
            System.out.print(a+" is a Leap Year");
        }else{
            System.out.print(a+" is not a Leap Year");
        }
    }
}