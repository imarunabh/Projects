package practice_programs;
import java.util.Scanner;

public class frequency_of_character {
    public static void main(String[] args) {
        int count=0;
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        for(int i =0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
              count=1;
                if(str.charAt(i)==str.charAt(j))
                    count=count+1;
            }
            System.out.println("The number of "+"' "+str.charAt(i)+" '"+" is "+count);
        }


    }
}
