package com.Kunal;
import java.util.Arrays;
import java.util.Scanner;



public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[]= new String[5];
        for(int i =0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        for(int i =0;i<str.length;i++){
            System.out.println(str[i]);
        }




    }
}
