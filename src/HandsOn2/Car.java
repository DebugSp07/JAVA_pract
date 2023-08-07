package HandsOn2;

public class Car {

	 int year,speed;
	    String make;
	    Car(int year,int speed, String make){
	        this.year=year;
	        this.make=make;
	        this.speed=speed;
	    }
	    int get_year(){
	        return year;
	    }
	    int get_speed(){
	        return speed;
	    }
	    String get_make(){
	        return make;
	    }
	        
		public static void main(String[] args) {
		    Car c1=new Car(2019,45,"BMW");
		    System.out.println("MAKE="+c1.get_make());
		    System.out.println("Speed="+c1.get_speed());
		    System.out.println("Year="+c1.get_year());
		
		}
}
