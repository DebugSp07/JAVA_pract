package HandsOn6;
import java.util.LinkedList;

public class AppendElementToLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Original LinkedList: " + names);

        String elementToAppend = "David";

        names.addLast(elementToAppend);

        System.out.println("LinkedList after appending '" + elementToAppend + "': " + names);
    }
}
