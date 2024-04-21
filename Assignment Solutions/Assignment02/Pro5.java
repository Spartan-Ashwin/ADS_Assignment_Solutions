package Assignment02;

import java.util.Scanner;

public class Pro5 {
	
	// Decimal to binary number using recursion
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		printBinary(n);

	}
	
	static void printBinary(int n) {
		
		if(n==0) {
			return;
		}
		
		int val=n%2;
		n=n/2;
		printBinary(n);
		System.out.print(val);
		
	}

}
