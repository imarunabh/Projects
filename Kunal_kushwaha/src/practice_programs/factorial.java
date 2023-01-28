package practice_programs;

public class factorial {
    public static void main(String[] args) {
        int fact=1;

    int num=12;
    while(num>0){
         fact=fact*num;
         num--;
    }
        System.out.println(fact);

    }
}
