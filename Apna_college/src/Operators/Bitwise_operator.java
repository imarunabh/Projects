package Operators;

public class Bitwise_operator {
    public static void main(String[] args) {
    /////////////////////////////BITWISE AND(&) OPERATION///////////////////////////////////////////
    /*  First it will convert the values of a and b into binary then it will  perform (AND)  operation
    and converts into decimal and gives it as output
    */
        int a=7;
        int b=5;
        System.out.println(a&b);

    ///////////////////////////BITWISE OR(|) OPERATION//////////////////////////////////////////////
        /*First it will convert the values of a and b into binary then it will  perform (OR) operation
    and converts into decimal and gives it as output
         */

        int c=7;
        int d=5;
        System.out.println(c|d);

    ///////////////////////////BITWISE XOR (XOR means if both voltages are either high or low then result will be low
        // otherwise it will be high). First of all convert into binary and then perform XOR operation and then convert into
        // decimal again
        int e=7;
        int f=5;
        System.out.println(e^f);

    ///////////////////////
        System.out.println(~e);
        System.out.println(e<<1);





    }



}
