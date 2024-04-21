package Assignment01;

import java.util.Scanner;

public class Pro10 {

	
	// Check is it Automorphic Number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq=n*n;
		
		if(n%10==sq%10) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}

	}

}
