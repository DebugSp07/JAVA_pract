package HandsOn3;

public class ques4 {
	
		public static void main(String[] args) {
			int[] array1 = {10, 10};
			int c=0;int dm=array1[0];
			for(int s=0;s<array1.length;s++){
			    if (array1[s]==dm){c+=1;}
			}
			if (c==array1.length){System.out.println("all Same element");}
			else{System.out.println("all different element");}
			
		
	}
}
