package com.Kunal;

public class array_sorting {
    public static void main(String[] args) {
        int[] arr={12,34,45,78,-23,56,-23};
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
