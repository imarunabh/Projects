package Strings;

public class String_using_objects {
    public static void main(String[] args) {
        String name1=new String("Tony Stack");
        String name2=new String("Tony Stack");
        if(name1.compareTo(name2)==0)
            System.out.println("Strings are equal");

        else
            System.out.println("Strings are not equal");
    }
}
