package String_builder;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        sb.append("e");//  str=str+"e"
        sb.append("l");//  str =str+"l"
        sb.append("l");//  str= str +"l"
        sb.append("o");//  str= str +"o"
        System.out.println(sb);
    }
}
