package HandsOn2;

public class Circle {

	    double radius;
	    Circle(){
	        this.radius=1.0;
	    }
	    Circle(double r){
	        this.radius=r;
	    }
	    void getradius()
	    {
	        System.out.println("radius=  "+radius);
	    }
	    void getArea()
	    {
	        double ans=(22/7)*(radius*radius);
	        System.out.println("area=  "+ans);
	    }
	    
		public static void main(String[] args) {
		    Circle c1= new Circle();
		    c1.getradius();
		    c1.getArea();
		    Circle c2= new Circle(13.0);
		    c2.getradius();
		    c2.getArea();
			
		}
	}

