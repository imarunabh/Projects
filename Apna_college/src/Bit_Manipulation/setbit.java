package Bit_Manipulation;

public class setbit {
    public static void main(String[] args) {
        /*
        In setbit we need to perform two steps
        1.Bit Manipulation i<<pos
        2.OR
         */
        int n=5;
        int pos=1;
        int BitMask=1<<pos;
        int Final= BitMask |n;
        System.out.println(Final);
    }
}
