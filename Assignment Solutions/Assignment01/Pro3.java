package Assignment01;
import java.util.Scanner;
public class Pro3 {

	//Prime Factor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPrimeFactor(n,2);
		
	}
	
	static void printPrimeFactor(int n,int div) {
		
		if(n<=1) {
			return;
		}
		
		if(n%div==0) {
			System.out.print(div+" ");
			printPrimeFactor(n/div,div);
		}else {
			printPrimeFactor(n,div+1);
		}
	}

}
