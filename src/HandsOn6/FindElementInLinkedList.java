package HandsOn6;
import java.util.LinkedList;

public class FindElementInLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        String elementToFind = "David";

        int position = names.indexOf(elementToFind);

        if (position != -1) {
            System.out.println("'" + elementToFind + "' exists in the LinkedList at position " + position+ ".");
        } else {
            System.out.println("'" + elementToFind + "' does not exist in the LinkedList.");
        }
    }
}
