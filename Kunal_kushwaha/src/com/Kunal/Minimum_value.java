package com.Kunal;

public class Minimum_value {
    public static void main(String[] args) {
        int[]arr= {23,45,234,56,34,23,45};
        int minimum=min(arr);

    }
    static int min(int[] ar){
        int minimu=ar[0];
        for(int x:ar){
           // if(ar<minimu){
                minimu=ar[x];
            }

        //}
        return minimu;
    }
}
