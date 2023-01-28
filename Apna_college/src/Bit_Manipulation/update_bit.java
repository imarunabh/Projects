package Bit_Manipulation;

public class update_bit {
    public static void main(String[] args) {
        int n=5;
        int choice=0;
        int pos=2;
        /*
        For 1:
        for making bit at the position 1 we need to perform two steps
        1.Bit mass 1<<pos
        2.OR operation
         */

        /*
        For 0;
        for making bit at the given position 0 we need to perform two steps
        1. Bit mass 1<<pos
        2. NOT with AND
         */
        switch(choice){

            case 0:{
                int Bitmass=1<<pos;
                int nonBitmass=~Bitmass;
                int update0=nonBitmass & n;
                System.out.println(update0);
            }
            break;

            case 1:{
                int Bitmass=1<<pos;
                int update0=Bitmass | n;
                System.out.println(update0);
            }
            break;
        }
    }
}
