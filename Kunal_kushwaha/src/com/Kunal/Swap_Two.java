package com.Kunal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;



public class Swap_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int arr[]={23,34,45,34,45,34,6,67,786,645,12};
    int value=max(arr);
        System.out.println(value);
        }

//        list.add(12);
//        list.add(34);
//        list.add(56);
//        list.add(34);
//        list.add(23);
//        list.add(79);
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.contains(56));

static int max(int a[]){
        int greatest=a[0];
        for(int i =1;i<a.length;i++){
            if(greatest<a[i])
                greatest=a[i];

        }
        return greatest;
}

}

