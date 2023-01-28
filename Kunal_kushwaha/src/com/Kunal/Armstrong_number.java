package com.Kunal;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[] args) {
//        int check=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int num = sc.nextInt();
//        int n=num;
//        while(n>0){
//            int rem=n%10;
//             check=check+(rem*rem*rem);
//             n=n/10;
//        }
//        if(num==check){
//            System.out.println("Number is Armstrong ");
//        }
//        else
//            System.out.println("Number is not Armstrong ");

        /////////////////////////using method///////////////////////////////////
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num =sc.nextInt();
//        boolean ans = isArmStrong(num);
//        System.out.println(ans);
        for(int i =100;i<1000;i++){
            if(isArmStrong(i))
                System.out.println(i);
        }
    }

    static boolean isArmStrong(int n){
        int check=0;
        int num=n;
        while(n>0){
            int rem=n%10;
             check=check+(rem*rem*rem);
             n=n/10;
        }
        if(num==check){
            return true;
        }
        else
          return false;

    }
}
