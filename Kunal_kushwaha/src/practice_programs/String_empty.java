package practice_programs;
import java.util.Scanner;
public class String_empty {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string");
         String s=sc.next();
         if(s.length()==0)
             System.out.println("String is empty");
         else
             System.out.println("String is not empty");

    }
}
