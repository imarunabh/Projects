package practice_programs;
import java.util.Arrays;
import java.util.Scanner;
public class character_To_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        System.out.println(Character.toString(ch));
        System.out.println("Enter the string ");
        String str= sc.next();
       char[] charArray= str.toCharArray();
        System.out.println(Arrays.toString(charArray));


    }
}
