package com.Kunal;

public class range_searching {
    public static void main(String[] args) {
        int arr[]={23,34,45,56,34,};
        System.out.println(min(arr));
    }
    static int min(int a[]){
        if(a.length==0)
            return Integer.MAX_VALUE;
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min<a[i])
                min=a[i];
            return min;
        }
        return Integer.MAX_VALUE;

    }
}
