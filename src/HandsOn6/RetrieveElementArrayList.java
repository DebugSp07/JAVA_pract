package HandsOn6;
import java.util.ArrayList;

public class RetrieveElementArrayList {
    public static void main(String[] args) {
    
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

       
        int indexToRetrieve = 2;

        if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) {
           
            String retrievedElement = fruits.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        } else {
            System.out.println("Invalid index! Please provide a valid index between 0 and " + (fruits.size() - 1));
        }
    }
}
