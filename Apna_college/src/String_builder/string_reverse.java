package String_builder;

public class string_reverse {
    public static void main(String[] args) {

    /////////////////////////////////////////Using array///////////////////////////////////////////////////
//        StringBuilder sb = new StringBuilder("Tony");
//        int[] arr= new int[sb.length()];
//        for(int i =0;i<sb.length();i++){
//             arr[i]=sb.charAt(sb.length()-i-1);
//        }
//        for(int i=0;i<sb.length();i++){
//            System.out.print(Character.toString(arr[i]));
//        }


    //////////////////////////////////////////Using String////////////////////////////////////////////////
//        StringBuilder sb = new StringBuilder("Tony");
//        int[] arr= new int[sb.length()];
//        String str= new String();
//        for(int i=0;i<sb.length();i++){
//            str= str+sb.charAt(sb.length()-i-1);
//        }
//        System.out.println(str);
// /////////////////////////////////////by exchanging half first with half last by running half loop///////////

    StringBuffer sb= new StringBuffer("Hello");
    for(int i=0;i<sb.length()/2;i++){
        int front=i;
        int back= sb.length()-i-1;
        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
        sb.setCharAt(front,backChar);
        sb.setCharAt(back,frontChar);
    }
        System.out.println(sb);

    }
}
