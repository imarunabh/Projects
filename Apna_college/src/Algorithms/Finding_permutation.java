package Algorithms;

public class Finding_permutation {
    public static void printpermutation(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char Currchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printpermutation(newstr,perm+Currchar,idx+1);

        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printpermutation(str,"",0);
    }
}
