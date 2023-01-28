package Bit_Manipulation;

public class ClearBit {
    public static void main(String[] args) {
        /*
        In ClearBit we need to perform two steps
        1. Bit Mask 1<<pos
        2. AND With NOT
         */
        int n=5;
        int pos=2;
        int Bitmask=1<<pos;
        int nonBitmask=~Bitmask;
        int clearbit= nonBitmask & n;
        System.out.println(clearbit);

    }
}
