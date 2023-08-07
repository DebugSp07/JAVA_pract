package HandsOn2;
import java.util.Scanner;

public class Holiday {
	 private String name;
	    private int day;
	    private String month;

	    public Holiday(String name, int day, String month) {
	        this.name = name;
	        this.day = day;
	        this.month = month;
	    }

	    public boolean inSameMonth(Holiday otherHoliday) {
	        return this.month.equalsIgnoreCase(otherHoliday.month);
	    }

	    public static double avgDate(Holiday[] holidays) {
	        int totalDays = 0;
	        for (Holiday holiday : holidays) {
	            totalDays += holiday.day;
	        }
	        return (double) totalDays / holidays.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the name of the holiday: ");
	        String name1 = scanner.nextLine();

	        System.out.print("Enter the day of the holiday: ");
	        int day1 = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Enter the month of the holiday: ");
	        String month1 = scanner.nextLine();

	        Holiday holiday1 = new Holiday(name1, day1, month1);

	        System.out.print("\nEnter the name of another holiday: ");
	        String name2 = scanner.nextLine();

	        System.out.print("Enter the day of the holiday: ");
	        int day2 = scanner.nextInt();
	        scanner.nextLine();

	        System.out.print("Enter the month of the holiday: ");
	        String month2 = scanner.nextLine();

	        Holiday holiday2 = new Holiday(name2, day2, month2);

	        scanner.close();

	        boolean sameMonth = holiday1.inSameMonth(holiday2);
	        System.out.println("\nAre " + holiday1.name + " and " + holiday2.name + " in the same month? " + sameMonth);

	        Holiday[] holidayArray = { holiday1, holiday2 };
	        double averageDate = avgDate(holidayArray);
	        System.out.println("Average date of holidays: " + averageDate);
	    }

}
