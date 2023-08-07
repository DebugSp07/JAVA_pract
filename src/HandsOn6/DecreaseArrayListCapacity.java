package HandsOn6;
import java.util.ArrayList;

public class DecreaseArrayListCapacity {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        ArrayList<Integer> decreasedNumbers = new ArrayList<>(numbers);

        System.out.println("Decreased ArrayList capacity to the current size: " + decreasedNumbers);
    }
}
