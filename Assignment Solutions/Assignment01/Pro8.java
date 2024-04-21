package Assignment01;

import java.util.Scanner;

public class Pro8 {
	
	// amicable numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int n1=getDivisorSum(num1,1,0);
		
		int n2=getDivisorSum(num2,1,0);
	
		if(n1==num2 && n2==num1) {
			System.out.println("Yes it is amicable numbers");
		}else {
			System.out.println("No it is not a amicable numbers");
		}
		

	}
	
	static int getDivisorSum(int n,int div,int ans) {
		
		if(div<=n/2) {
			if(n%div==0) {
				ans+=div;
			}
			return getDivisorSum(n,div+1,ans);
		}else {
			return ans;
		}
	}

}
