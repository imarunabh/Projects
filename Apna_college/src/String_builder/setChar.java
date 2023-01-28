package String_builder;

public class setChar {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");

        // char At 0 index
        System.out.println(sb.charAt(0));

        // set Char at 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
    }
}
