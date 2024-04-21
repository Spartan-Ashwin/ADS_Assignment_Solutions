package Assignment02;

import java.util.Scanner;

public class Pro2 {

	// Mean of Array using Recursion
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=findSum(n);
		System.out.println(sum);

	}
	
	static int findSum(int n) {
		
		if(n==1) {
			return 1;
		}
		
		return n+findSum(n-1);
	}

}
