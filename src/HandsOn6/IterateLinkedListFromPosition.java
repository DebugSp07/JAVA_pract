package HandsOn6;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListFromPosition {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        System.out.println("Original LinkedList: " + names);

        int startPosition = 2;
        ListIterator<String> iterator = names.listIterator(startPosition);

        System.out.println("Elements starting from position " + startPosition + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

