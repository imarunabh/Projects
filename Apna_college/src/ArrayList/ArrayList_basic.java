package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class ArrayList_basic {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();

        // add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int number;
        System.out.println(list.get(0));

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(1,5);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);

        System.out.println(list);

    }
}
