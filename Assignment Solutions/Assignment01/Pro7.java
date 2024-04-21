package Assignment01;

import java.util.Scanner;

public class Pro7 {
	
	// Perfect Number 6/28

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num=find(n,1,0);
		
		if(n==num) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	
	static int find(int n,int div,int ans) {
		
	
		
		if(div<=n/2) {
			if(n%div==0)
			ans+=div;
			return find(n,div+1,ans);
		}else {
			return ans;
		}
	}

}
