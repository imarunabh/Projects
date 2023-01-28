package sorting_Algorithms;

public class Rough {
//    static void ArrayPrint(int[] arr){
//       for(int i=0;i<arr.length-1;i++){
//            System.out.println(arr[i]);
//        }
//    }
    public static void main(String[] args) {
//        //bubble sort
        //    int[] arr={12,67,34,90,23};
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    //swap
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        ArrayPrint(arr);


        //insertion sort
//        for(int i=0;i<arr.length-1;i++){
//            int smallest=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[smallest]>arr[j]) {
//                    smallest = j;
//                }
//            }
//            //swap
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        // insertion sort
  int[] arr={12,16,28,36,9,2};
  for(int i=1;i<arr.length;i++){
      int current=arr[i];
      String str= new String("Chemistry");
      System.out.println(str.length());
      int j=i-1;
     while(j>=0&& current<arr[j]){
         arr[j+1]=arr[j];
         j--;
     }
     arr[j+1]=current;
  }
  for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
  }

    }
}
