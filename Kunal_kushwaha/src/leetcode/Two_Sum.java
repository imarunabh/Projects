package leetcode;
import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[]={2,7,11,15};
//        int target=9;
//        for(int i =0;i<4;i++){
//            for(int j=i+1;j<4;j++)
//                if(arr[j]+arr[i]==target){
//                    System.out.println(arr[j]+" "+arr[i]);
//             }
        System.out.println("Enter the number of numbers in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("Enter the target ");
        int target=sc.nextInt();

        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]+arr[i]==target)
                    System.out.println(arr[j]+" "+arr[i]);


            }



        }
    }

}
