package HandsOn2;
import java.util.Scanner;
public class Que8 {
	
	public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int num1;
	        int num2;
           
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first integer: ");
	        num1= sc.nextInt();
	        System.out.print("Enter the second integer: ");
	        num2= sc.nextInt();
	        int sum = getTotal(num1, num2);
	        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	    

	    

	}
}
