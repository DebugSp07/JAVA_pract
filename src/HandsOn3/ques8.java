package HandsOn3;
import java.util.*;

public class ques8 {

		public static void main(String[] args) {
			int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {6, 7, 8, 9, 10};
	        int[] ans =new int[array1.length];
	        
	        for(int i=0;i<array1.length;i++){
	            ans[i]=array1[i]+array2[i];}
	            System.out.println("mergedarray: "+ Arrays.toString(ans));
	            
	        
	            
		
	}
}
