package Assignment01;
import java.util.*;
public class Pro4 {

	// Palindrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num=isPalindrome(0,n,10);
	
		if(n==num) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	
	static int isPalindrome(int ans,int n,int pow) {
		
		if(n==0) {
			return ans;
		}

		ans=ans*pow+(n%10);
		
		return isPalindrome(ans,n/10,pow);
		
		
	}
	
		
}
