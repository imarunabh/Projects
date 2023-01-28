package Strings;

public class sub_strings {
    public static void main(String[] args) {
        String name="Tony Stack";

        //This example says Substring1 takes the beginning index and ending index
        String Substring1=name.substring(2,7);

        //This example says Substring2 takes only beginning index and takes the last index as the ending index
        String Substring2=name.substring(3);

        /*This example says that the indexing in substring starts from 0 not from 1
          so, it will start printing from 1 and prints upto the last index given -1
         */
        String Substring3=name.substring(0,4);

        System.out.println(Substring1);
        System.out.println(Substring2);
        System.out.println(Substring3);
    }
}
