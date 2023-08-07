package HandsOn2;

public class Movie {
	   private String title;
	    private String studio;
	    private String rating;

	    public Movie(String title, String studio, String rating) {
	        this.title = title;
	        this.studio = studio;
	        this.rating = rating;
	    }

	    public Movie(String title, String studio) {
	        this.title = title;
	        this.studio = studio;
	        this.rating = "PG";
	    }

	    public static void main(String[] args) {
	        Movie movie1 = new Movie("Movie 1", "Studio 1", "PG-13");
	        Movie movie2 = new Movie("Movie 2", "Studio 2");

	 System.out.println("Movie 1: " + movie1.title + ", " + movie1.studio + ", " + movie1.rating);
	 System.out.println("Movie 2: " + movie2.title + ", " + movie2.studio + ", " + movie2.rating);
	    }
}
