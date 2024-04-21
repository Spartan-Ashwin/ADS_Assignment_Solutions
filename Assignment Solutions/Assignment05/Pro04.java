package Assignment05;

import java.util.Arrays;

public class Pro04 {
	
	//  Merge Sort 
	
public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1};
		
		System.out.println("Before Sorting..");
		
		System.out.println(Arrays.toString(arr));
		
		
		mergesort(arr,0,arr.length-1);
		
		System.out.println("After Sorting..");
		
		System.out.println(Arrays.toString(arr));
	}

    static void mergesort(int[]arr, int lb,int ub) {
    	
    	if(lb<ub) {
    		
    		int mid=lb+(ub-lb)/2;
    		mergesort(arr,lb,mid);
    		mergesort(arr,mid+1,ub);
    		merge(arr,lb,mid,ub);
    	}
    	
    }
    
    static void merge(int[] arr,int lb,int mid,int ub) {
    	
    	int[] temp=new int[ub-lb+1];
    	
    	int i=lb;
    	int j=mid+1;
    	int k=0;
    	
    	while(i<=mid && j<=ub) {
    		if(arr[i]<arr[j]) {
    			temp[k]=arr[i];
    			i++;
    		}else {
    			temp[k]=arr[j];
    			j++;
    		}
    		k++;
    	}
    	
    	while(i<=mid) {
    		temp[k]=arr[i];
    		k++;
    		i++;
    	}
    	
    	while(j<=ub) {
    		temp[k]=arr[j];
    		j++;
    		k++;
    	}
    	k=0;
    	for(int x=lb;x<=ub;x++) {
    		arr[x]=temp[k];
    		k++;
    	}
    	
    }

}
