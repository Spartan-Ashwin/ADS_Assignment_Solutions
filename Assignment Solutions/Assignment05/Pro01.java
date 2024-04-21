package Assignment05;

import java.util.Arrays;

public class Pro01 {
	
	// Bubble Sort
	
	public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1};
		
		System.out.println("Before Sorting..");
		
		System.out.println(Arrays.toString(arr));
		
		
		bubblesort(arr);
		
		System.out.println("After Sorting..");
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubblesort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			boolean flag=true;
			for(int j=0;j<arr.length-1-i;j++) {
				
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=false;
					}
			}
			if(flag) {
				break;
			}
		}
	}

}
