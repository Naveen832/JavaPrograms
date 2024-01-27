package JAvaProgrammin;

public class FindMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int p[]  = {12,2,34,232,44};
 int min = p[0];
 for(int i=0;i<p.length;i++){
	 if(p[i]<min) {
		 min = p[i];
	 }
 }
 
 System.out.println("Min value is : "+min);
	}

}
