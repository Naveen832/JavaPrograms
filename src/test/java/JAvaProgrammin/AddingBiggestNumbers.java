package JAvaProgrammin;

import java.math.BigInteger;
import java.util.Scanner;

import org.bouncycastle.util.BigIntegers;

public class AddingBiggestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n1,n2;
         Scanner sc  = new Scanner(System.in);
         n1=sc.nextInt();
         Scanner sc1  = new Scanner(System.in);
         n2=sc1.nextInt();
         BigInteger b1 = new BigInteger(n1);
         BigInteger b2 = new BigInteger(n2);
         BigInteger sum;
         sum = b1.add(b2);
         System.out.println("adding the number: "+sum);
         
	}

}
