package HandsOn3;

public class Rectangle {

	    private double width;
	    private double height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    public double getArea() {
	        return width * height;
	    }

	    public double getPerimeter() {
	        return 2 * (width + height);
	    }

	    public static void main(String[] args) {
	        double width = 5.0;
	        double height = 3.0;

	        Rectangle rectangle = new Rectangle(width, height);

	        double area = rectangle.getArea();
	        double perimeter = rectangle.getPerimeter();

	        System.out.println("Rectangle with width " + width + " and height " + height);
	        System.out.println("Area: " + area);
	        System.out.println("Perimeter: " + perimeter);
	    
	}
}
