package Assignment05;

import java.util.Arrays;

public class Pro02 {
	
	//  Selection Sort 
	
	
public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1};
		
		System.out.println("Before Sorting..");
		
		System.out.println(Arrays.toString(arr));
		
		
		selectionsort(arr);
		
		System.out.println("After Sorting..");
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionsort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int min=i;
			for(int j=min+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
			if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}

	
}
