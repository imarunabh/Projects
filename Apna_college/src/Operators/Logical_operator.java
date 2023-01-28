package Operators;

public class Logical_operator {
    public static void main(String[] args) {
        ////////////// && //////////////////////
        int a =34;
        int b=34;
        if(a>0&&b>0)
            System.out.println(a +"  "+b+" are  positive numbers");

        else if(a<0&&b<0)
            System.out.println(a +"  "+b+" are  negative numbers");

        else
            System.out.println(a +"  "+b+" are  mixed  numbers");




        /////////////////// || ///////////////////////////////

        char  c ='M';
         char d='m';
         char e='M';

        if(e==c||e==d)
            System.out.println("Male");
        else
            System.out.println("Female");

        ///////////////////// Logical ! operator ///////////////////////
        int f=33;
        int g=34;

        if(!(f>g)){
            System.out.println(f+" is less than "+ g);
        }




    }

}
