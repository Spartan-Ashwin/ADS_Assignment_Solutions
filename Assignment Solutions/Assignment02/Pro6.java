package Assignment02;

import java.util.Scanner;

public class Pro6 {
	
	//  Sum of digit of a number using recursion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=findSum(n);
		System.out.println(sum);

	}
	
	static int findSum(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n%10+findSum(n/10);
	}

}
