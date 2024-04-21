package Assignment06;

import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,4,5,6,7,8,9};
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		
		System.out.println(found(arr,key));

	}
	
static boolean found(int[] arr,int key) {
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int mid=i+(j-i)/2;
			
			if(arr[mid]==key) {
				return true;
			}
			
			if(arr[mid]>key) {
				j=mid-1;
			}else {
				i=mid+1;
			}
		}
		return false;
	}


}
