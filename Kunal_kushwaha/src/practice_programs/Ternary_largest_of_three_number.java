package practice_programs;
import java.util.Scanner;
public class Ternary_largest_of_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int temp=(num1>num2)?num1:num2;
        int result=(temp>num3)?temp:num3;
        System.out.println(result);


    }
}
