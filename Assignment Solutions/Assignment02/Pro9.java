package Assignment02;

public class Pro9 {

	// Find Array Sum
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5};
		
		int sum=findSum(arr,0);
		System.out.println(sum);

	}
	
	static int findSum(int[] arr,int idx) {
		
		if(arr.length==idx) {
			return 0;
		}
		
		return arr[idx]+findSum(arr,idx+1);
	}

}
