package HandsOn6;
import java.util.LinkedList;

public class AddLinkedListAtSpecifiedIndex {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Alice");
        list1.add("Bob");
        list1.add("Charlie");

        System.out.println("First LinkedList: " + list1);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("David");
        list2.add("Eve");

        System.out.println("Second LinkedList: " + list2);

        int index = 1;

        list1.addAll(index, list2);

        System.out.println("LinkedList after adding at index " + index + ": " + list1);
    }
}

