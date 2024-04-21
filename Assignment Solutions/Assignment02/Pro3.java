package Assignment02;

public class Pro3 {
	
	// Mean of Array using Recursion
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		int sum=findSum(arr,0);
		System.out.println("Array Mean is : "+(sum/arr.length));
		

	}
	
	static int findSum(int[] arr,int idx) {
		
		if(idx==arr.length) {
			return 0;
		}
		return arr[idx]+findSum(arr,idx+1);
	}

}
