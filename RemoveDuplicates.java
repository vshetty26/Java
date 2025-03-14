import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println("List after removing duplicates: " + list);
    }
}
