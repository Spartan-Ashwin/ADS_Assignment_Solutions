package Assignment02;

import java.util.Scanner;

public class Pro7 {
	
	// Print Reverse String 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		printReverse(str,0);

	}
	
	static void printReverse(String str,int idx) {
		
		if(idx==str.length())
		return;
		
		printReverse(str,idx+1);
		System.out.print(str.charAt(idx));
	}

}
