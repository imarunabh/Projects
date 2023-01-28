package Bit_Manipulation;

public class getbit {
    public static void main(String[] args) {
        /*In getbit we need to do perform two steps
        1. Bit manipulation i<<pos
        2. AND
         */
        int n=5;//0101
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask & n)==0)
            System.out.println("Bit was 0");
        else
            System.out.println("Bit was 1");
    }
}
