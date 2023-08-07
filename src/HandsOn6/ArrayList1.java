package HandsOn6;
import java.util.ArrayList;
public class ArrayList1 {

	    public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);

	        System.out.println("Original ArrayList: " + numbers);

	        int newSize = numbers.size() + 3;
	        ArrayList<Integer> increasedNumbers = new ArrayList<>(newSize);
	        increasedNumbers.addAll(numbers);

	        increasedNumbers.add(5);
	        increasedNumbers.add(6);
	        increasedNumbers.add(7);

	        System.out.println("Increased ArrayList: " + increasedNumbers);
	    
	}
}
