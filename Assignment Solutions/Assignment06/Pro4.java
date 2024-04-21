package Assignment06;

import java.util.Arrays;

public class Pro4 {
	
	// 4. Sort an array of 0s, 1s and 2s
	
	public static void main(String[] args) {
		
		
		// Using Dutch National Flag Algorithm
		
		int[] arr= {0,2,1,2,0};
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		
		int start=0,mid=0,end=arr.length-1;
		
		while(mid<=end) {
			
			if(arr[mid]==0) {
				
				int temp=arr[start];
				arr[start]=arr[mid];
				arr[mid]=temp;
				start++;
				mid++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				int temp=arr[end];
				arr[end]=arr[mid];
				arr[mid]=temp;
				end--;
			}
		}
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
	}

}
