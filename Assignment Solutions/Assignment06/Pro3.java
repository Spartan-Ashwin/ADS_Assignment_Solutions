package Assignment06;

import java.util.Arrays;

public class Pro3 {

	// Sort elements by frequency
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {8,3,4,6,1,2,4,3,9};
		
		System.out.println("Before Sorting..");
		System.out.println(Arrays.toString(arr));
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
		   if(arr[i]>max) {
			   max=arr[i];
		   }
		}
		
		int[] temp=new int[max+1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]]++;
		}
		
		for(int i=0;i<temp.length;i++) {
			int count=temp[i];
			
			while(count-->0) {
				arr[j]=i;
				j++;
			}
			
		}
		
		System.out.println("After Sorting..");
		System.out.println(Arrays.toString(arr));
		
		

	}

}
