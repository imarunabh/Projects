package Operators;

public class Relational_operator {
    public static void main(String[] args) {
        /////// == operator  //////////
        int a=34;
        int b =45;
        if(a==b)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");

        ////////////// != operator ///////////////
        int c=34;
        int d=34;
        if(c!=d)
            System.out.println("Both are not equal");
        else
            System.out.println("Both are equal");

        ////////////// > operator ///////////////
        int e=34;
        int f=45;
        if(e>f)
            System.out.println(e+" is greater than  "+f);

        else
            System.out.println(f+" is greater than  "+e);


        ///////////// < operator /////////////////
        int g=45;
        int h=56;
        if(g<h)
            System.out.println(g+" is less than  "+h);
        else
            System.out.println(h+" is less than  "+g);

        /////////////// >= operator ////////////////////
        int i=34;
        int j=67;
        if(i>=j)
            System.out.println(i+" is greater than equal to "+j);

        else
            System.out.println(j+" is greater than equal to "+i);

        //////////////////// <= operator ////////////////////////
        int k=23;
        int l=56;
        if(k<=l)
            System.out.println(k+" is less than equal to  "+l);
        else
            System.out.println(l+" is less than equal to  "+k);



    }

}
