package HandsOn6;
import java.util.ArrayList;

public class ReplaceElementInArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Original ArrayList: " + fruits);

        String elementToReplace = "Banana";

        String replacementElement = "Grapes";

        if (fruits.contains(elementToReplace)) {
            int index = fruits.indexOf(elementToReplace);
            fruits.set(index, replacementElement);
            System.out.println("ArrayList after replacing '" + elementToReplace + "' with '" + replacementElement + "': " + fruits);
        } else {
            System.out.println("Element '" + elementToReplace + "' not found in the ArrayList.");
        }
    }
}
