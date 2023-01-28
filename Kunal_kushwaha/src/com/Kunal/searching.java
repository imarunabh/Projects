package com.Kunal;

public class searching {
    public static void main(String[] args) {
//        int target=34;
//        int[] arr={23,67,78,34,23,45};
//        for(int x:arr){
//            if(x==target)
//                System.out.println(target +" is present in the array");
//  }

//////////////////////////////////USING FOR-EACH LOOP AND FOR METHODS////////////////////////////////////////////
//        int[] arr={12,34,45,23,45,76,745,89,2};
//        int target=34;
//        System.out.println( search(arr,target));
//
//    }
//    static int search(int as[],int b){
//        if(as.length==0)
//            return Integer.MAX_VALUE;
//
//        for(int x:as){
//            if(x==b)
//                return x;
//
//        }
//        return Integer.MAX_VALUE;

///////////////////////////////////////USING FOR LOOP AND USING METHOD//////////////////////////////////////////
//        String str="name";
//        char c='a';
//        System.out.println(check(str,c));
//    }
//    static boolean check(String s,char ch){
//        if(s.length()==0)
//            return false;
//
//        for(int i =0;i<s.length();i++){
//            if(s.charAt(i)==ch)
//                return true;
//
//        }
//        return false;
///////////////////////////////USING FOR LOOP-EACH AND USING METHODS///////////////////////////////////////////
        String str="Apple";
        char ch='A';
        System.out.println(check(str,ch));

    }
    static boolean check(String s,char c){
        if(s.length()==0)
            return false;

        for(char cha:s.toCharArray()){
            if(cha==c)
                return true;

        }
        return false;
    }
}
