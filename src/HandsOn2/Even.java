package HandsOn2;
import java.util.Scanner;
public class Even {

	 public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer number: ");
	        int numberToCheck = scanner.nextInt();

	        boolean isNumberEven = isEven(numberToCheck);
	        System.out.println("Is " + numberToCheck + " even? " + isNumberEven);

	        scanner.close();
	    }

}
