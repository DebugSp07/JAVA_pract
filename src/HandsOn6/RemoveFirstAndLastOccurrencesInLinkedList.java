package HandsOn6;
import java.util.LinkedList;

public class RemoveFirstAndLastOccurrencesInLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        names.add("David"); 

        System.out.println("Original LinkedList: " + names);

        String elementToRemove = "David";

        boolean removedFirst = names.removeFirstOccurrence(elementToRemove);
 
        boolean removedLast = names.removeLastOccurrence(elementToRemove);

        if (removedFirst) {
            System.out.println("First occurrence of '" + elementToRemove + "' removed.");
        } else {
            System.out.println("First occurrence of '" + elementToRemove + "' not found.");
        }

        if (removedLast) {
            System.out.println("Last occurrence of '" + elementToRemove + "' removed.");
        } else {
            System.out.println("Last occurrence of '" + elementToRemove + "' not found.");
        }

        System.out.println("LinkedList after removing first and last occurrences: " + names);
    }
}

