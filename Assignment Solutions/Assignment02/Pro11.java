package Assignment02;

import java.util.Scanner;

public class Pro11 {

	// Print Fibo Series
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printFibo(n,0,1,1);

	}
	
	static void printFibo(int n,int a,int b,int count) {
		
		
		 if(count<=n) {
			 
			 System.out.print(a+" ");
			 int c=a+b;
			 a=b;
			 b=c;
			 printFibo(n,a,b,count+1);
			 
		 }else {
			 return;
		 }
	}

}
