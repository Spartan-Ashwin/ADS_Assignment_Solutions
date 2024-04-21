package Assignment06;

import java.util.Scanner;

public class Pro01 {
	
	// 1: Linear Search
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		
		System.out.println(found(arr,key));
	}
	
	static boolean found(int[] arr,int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}

}
