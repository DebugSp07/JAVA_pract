package HandsOn3;

public class ques7 {

		public static void main(String[] args) {
			int[] array1 = {211, 20, 21, 44, 45};
	        int ans=array1[0];
	        int temp=array1[1];
	        for(int i=0;i<array1.length;i++){
	            int c=array1[i];
	            if(c<temp){
	                ans=temp;
	                temp=c;
	            }else if(c<ans && c!=temp){
	                ans=c;}
	        }
	            
	        System.out.println("Second smallest value: "+ans);
	            
		
	}
}
