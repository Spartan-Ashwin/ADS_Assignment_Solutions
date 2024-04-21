package Assignment01;

import java.util.Scanner;

public class Pro9 {
	
	// Ramanujan Number or Taxicab Number in Java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=findDigitSum(n);
		
		int rev=findReverse(sum,10,0);
		
		
		if(sum*rev==n) {
			System.out.println("Yes it is a Ramanujan Number");
		}else {
			System.out.println("No it is a Ramanujan Number");
		}
	

	}
	
	static int findReverse(int n,int pow,int ans) {
		
		if(n==0) {
			return ans;
		}
		
		ans=ans*pow+n%10;
		return findReverse(n/10,pow,ans);
		
	}
	
	static int findDigitSum(int n) {
		if(n==0) {
			return 0;
		}
		
		return n%10+findDigitSum(n/10);
	}

}
