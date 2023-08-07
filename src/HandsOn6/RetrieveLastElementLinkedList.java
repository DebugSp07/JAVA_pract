package HandsOn6;
import java.util.LinkedList;

public class RetrieveLastElementLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Original LinkedList: " + names);

        if (!names.isEmpty()) {
            String lastElement = names.getLast();
            System.out.println("Last Element: " + lastElement);
        } else {
            System.out.println("LinkedList is empty.");
        }

        System.out.println("LinkedList after retrieval: " + names);
    }
}




