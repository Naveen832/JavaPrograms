package JAvaProgrammin;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "NAveen Kumar";
		int L = s.length();
		String rev = " ";
		for (int i = L-1; i >=0; i--) {
			rev = rev+s.charAt(i);
			
			
		}
		System.out.println("reverse stirng is: "+rev);

	}

}
