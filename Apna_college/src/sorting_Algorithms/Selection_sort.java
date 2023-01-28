package sorting_Algorithms;

public class Selection_sort {
    public static void main(String[] args) {
        // Selection sort
        //Time Complexity O(n^2)
        int[] arr={12,26,56,25,45,24,56};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;

            }
            }
            //swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
