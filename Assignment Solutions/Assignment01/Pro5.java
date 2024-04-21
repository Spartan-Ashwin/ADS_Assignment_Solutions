package Assignment01;

import java.util.Scanner;

public class Pro5 {
	
	
	// Prime Or Not

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n!=1 && isPrime(n,2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
	
	static boolean isPrime(int n,int div) {
		
		
		if(div*div<=n) {

			if(n%div==0) {
				return false;
			}
			
			return isPrime(n,div+1);
		}else {
			return true;
		}
	
	}

}
