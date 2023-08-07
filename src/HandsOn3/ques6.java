package HandsOn3;

public class ques6 {

		public static void main(String[] args) {
			int[] array1 = {211, 20, 21, 44, 45};
			int evsm=0;
			for(int x:array1){
			    if (x%2==0){evsm+=x;}
			}
			System.out.println("Even sum = "+evsm);
		
	}
}
