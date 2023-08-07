package HandsOn6;
import java.util.ArrayList;
import java.util.Collections;


public class SwapArrayListElements {
    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original ArrayList: " + numbers);

        int index1 = 1;
        int index2 = 2;
        Collections.swap(numbers, index1, index2);

        System.out.println("ArrayList after swapping elements at index " + index1 + " and index " + index2 + ": " + numbers);
    }
}