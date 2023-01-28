package practice_programs;
import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal;
        float time;
        float rate;
        float  intrest;
        System.out.println("Enter the parameters P T R");
        principal=sc.nextFloat();
        time=sc.nextFloat();
        rate=sc.nextFloat();
        intrest=(principal*time*rate)/100;
        System.out.println(intrest);

    }
}
