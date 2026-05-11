import java.util.*;
public class p1 {
    public static void main(String[] args) {
       // ArrayList<Integer> list = new ArrayList<>();
        //LinkedList<Integer> linkedList = new LinkedList<>();
        // Sets --> Des not take duplicate
        // maps --> key value pair
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);

        for (int n : set) {
            System.out.println(n);
        }
    }
}