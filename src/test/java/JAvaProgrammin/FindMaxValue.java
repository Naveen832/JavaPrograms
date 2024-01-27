package JAvaProgrammin;

public class FindMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[]  = {12,2,34,232,44};
		 int max = p[0];
		 for(int i=0;i<p.length;i++){
			 if(p[i]>max) {
				 max = p[i];
			 }
		 }
		 
		 System.out.println("Max value is : "+max);
			}

	}

