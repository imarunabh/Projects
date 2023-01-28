package practice_programs;
import java.sql.SQLOutput;
import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operator;
        int number1;
        int number2;

        System.out.println("Enter the operator ");
        operator=sc.next();

        System.out.println("Enter the first number");
        number1=sc.nextInt();

        System.out.println("Enter the second number");
        number2=sc.nextInt();

        switch(operator){
            case "+"-> System.out.println(number1+number2);

            case "-"-> System.out.println(number1-number2);

            case "*"-> System.out.println(number1*number2);

            case "/"->
            {
               try{
                   System.out.println(number1/number2);
               }
               catch(ArithmeticException e){
                   System.out.println(e);
               }
            }
            case "%"-> {
                try {
                    System.out.println(number1 % number2);
                }
                catch(ArithmeticException e){
                System.out.println(e);
                }
            }
            default-> System.out.println("Invalid choice");

        }
    }
}
