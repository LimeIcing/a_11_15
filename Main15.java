import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main15 {

    /*
    Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the
    most frequently occurring integer (the “mode”) occurs in the list. Solve this problem using a map as auxiliary
    storage. If the list is empty, return 0 .
     */

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(8);
        a.add(5);
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(3);
        a.add(5);
        a.add(2);
        System.out.println(maxOccurrences(a));
    }

    public static int maxOccurrences(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        HashSet<Integer> aux = new HashSet<>(list);
        int mode = 0;

        for (int n:aux) {
            int counter = 0;
            for (int i = 0; i < list.size(); i++) {
                if (n == list.get(i)) {
                    counter++;
                }
            }
            if (counter > mode) {
                mode = counter;
            }
        }

        return mode;
    }
}
