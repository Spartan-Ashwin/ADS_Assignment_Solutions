package Assignment02;

import java.util.Scanner;

public class Pro8 {

	// Find String length
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=findLen(str,0,0);
		System.out.println(len);

	}
	
	static int findLen(String str,int idx,int ans) {
		
		try {
			char ch=str.charAt(idx);
			
			return findLen(str,idx+1,ans+1);
		}catch(Exception e) {
			return ans;
		}
	}

}
