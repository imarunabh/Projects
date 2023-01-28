package Linked_List;
import java.util.*;

public class LL_using_collection_Framework {
    public static void main(String[] args) {
        LinkedList<String > list= new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());


        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        // if we don't specify whether to remove from first or last then it will automatically remove from first
        list.remove();

        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

    }
}
