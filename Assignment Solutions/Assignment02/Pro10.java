package Assignment02;

import java.util.Scanner;

public class Pro10 {

	// Palindrome String 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		if(isPalindrome(str,0,str.length()-1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	
	static boolean isPalindrome(String str,int i,int j) {
		
		if(i>=j) {
			return true;
		}
		if(str.length()==1) {
			return true;
		}
		
		if(str.charAt(i)==str.charAt(j)) {
			return true&&isPalindrome(str,i+1,j-1);
		}else {
			return false;
		}
	}

}
