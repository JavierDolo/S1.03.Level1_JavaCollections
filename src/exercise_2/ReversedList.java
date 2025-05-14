package exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReversedList {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> iterator = list1.listIterator(list1.size());
        while (iterator.hasPrevious()) {
            list2.add(iterator.previous());
        }

        System.out.println("Original list: " + list1);
        System.out.println("Reversed list: " + list2);
    }
}
