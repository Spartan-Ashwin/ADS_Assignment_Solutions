package Assignment05;

import java.util.Arrays;

public class Pro03 {
	
public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1};
		
		System.out.println("Before Sorting..");
		
		System.out.println(Arrays.toString(arr));
		
		
		insertionsort(arr);
		
		System.out.println("After Sorting..");
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertionsort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			int curr=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>curr) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=curr;
		}
	}


}
