import java.util.Scanner;
public class ternary_operator {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = obj.nextInt();
        String result = (age>=18)?"you may vote":"not old enough to vote";
        System.out.println(result);
    }
}