package exercise_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Month> months = new ArrayList<>(List.of(
                new Month("January"),
                new Month("February"),
                new Month("March"),
                new Month("April"),
                new Month("May"),
                new Month("June"),
                new Month("July"),
                new Month("September"),
                new Month("October"),
                new Month("November"),
                new Month("December")
        ));

        months.add(7,new Month("August"));
        months.add(8,new Month("August"));

        for (Month month : months) {
            System.out.println(month);
        }

        Set<Month> monthSet = new LinkedHashSet<>(months);
        System.out.println("\n-Months in HashSet (no duplicates):");
        for (Month m : monthSet) {
            System.out.println(m);
        }

        // Iterate through the list using a for-each loop
        System.out.println("\n-Iterating through the list with a for-each loop:");
        for (Month month : monthSet) {
            System.out.println(month);
        }

        // Iterate through the list using an Iterator
        System.out.println("\n-Iterating through the list with an Iterator:");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
