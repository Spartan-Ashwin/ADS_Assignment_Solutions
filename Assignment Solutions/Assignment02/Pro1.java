package Assignment02;

import java.util.Scanner;

public class Pro1 {
	
	// Print 1 to n without using loops

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);

	}
	
	static void print(int n) {
		
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.println(n);
	}

}
