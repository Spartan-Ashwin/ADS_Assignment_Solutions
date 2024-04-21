package Assignment01;

import java.util.Scanner;

public class Pro6 {

	// Armstrong Number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
			count++;
		}
		
		int num=find(n,count,0);
		if(n==num) {
			System.out.println("Yes");
		}else{
		System.out.println("NO");
		}

	}
	
	static int find(int n,int pow,int ans) {
		
		if(n==0) {
			return ans;
		}
		int k=n%10;
		ans+=(int)Math.pow(k,pow);
		return find(n/10,pow,ans);
	}
	
	

}
