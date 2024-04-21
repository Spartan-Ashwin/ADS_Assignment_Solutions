package Assignment05;

import java.util.Arrays;

public class Pro05 {
	
	// Quick Sort
	
	public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1};
		
	System.out.println("Before Sorting..");
		
		System.out.println(Arrays.toString(arr));
		
		
		quicksort(arr,0,arr.length-1);
		
		System.out.println("After Sorting..");
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void quicksort(int[] arr,int lb,int ub) {
		
		if(lb<ub) {
			int pivotIndex=findPivotIndex(arr,lb,ub);
			quicksort(arr,lb,pivotIndex-1);
			quicksort(arr,pivotIndex+1,ub);
		}
		
	}
	
	static int findPivotIndex(int[] arr,int lb,int ub) {
		
		int pivot=arr[ub];
		int idx=lb-1;
		int i=lb;
		while(i<=ub) {
			if(arr[i]<pivot) {
				idx++;
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
			}
			i++;
		}
	     idx++;
		int temp=arr[idx];
		arr[idx]=arr[ub];
		arr[ub]=temp;
		return idx;
	}

}
