package com.Kunal;

public class even_of_odd_digits {
    public static void main(String[] args) {
        int count=0;
        int[] nums={12,345,2,6,7896};
        for(int i =0;i<nums.length;i++){
            int temp=nums[i];
          while(temp>0){
              count++;
             temp=temp/10;


          }
            if(count%2==0)
                System.out.println(nums[i] +" contains even digits");

            else
                System.out.println(nums[i] +" contains odd digits");
            count=0;
        }
//        int[] arr={12,345,2,5,2345};
//        for(int i =0;i<arr.length;i++){
//            String str=Integer.toString(arr[i]);
//            if(str.length()%2==0)
//                System.out.println(arr[i]+" is even number ");
//
//            else
//                System.out.println(arr[i]+" is an odd number ");
//        }
    }
}
