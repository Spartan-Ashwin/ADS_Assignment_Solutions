package Assignment01;
import java.util.Scanner;
public class Pro1 {

	// GCD OF TWO NUMBER 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int k=Math.min(n1, n2);
		
		int gcd=findGcd(n1,n2,k);
		
		System.out.println("Gcd = "+gcd);

	
	}
	
	static int findGcd(int n1,int n2,int k) {
		
		if(k==1) {
			return 1;
		}
		
		if(n1%k==0 && n2%k==0) {
			return k;
		}
		
		return findGcd(n1,n2,k-1);
	}

}
