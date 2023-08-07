package HandsOn3;
import java.util.Arrays;

public class ques5 {

		public static void main(String[] args) {
			int[] array1 = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
			int s=3;int e=8;
			int[] subarray=new int [(e-s)+1];
			int i=0;
			for(s=3;s<=e;s++){
			    subarray[i]=array1[s];
			    i+=1;
			}
			System.out.println("subarray = "+Arrays.toString(subarray));
		
	}
}
