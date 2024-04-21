package Assignment06;

import java.util.*;

public class Pro10 {
	
	// 10. Java Program to Implement Queue Using Two Stacks
	
	
	static private Scanner sc=new Scanner(System.in);
	
	static Stack<Integer> stk1=new Stack<>();
	static Stack<Integer> stk2=new Stack<>();

	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("1.add()");
			System.out.println("2.poll()");
			System.out.println("3.peek()");
			System.out.println("4.isEmpty()");
			System.out.println("5.EXIT");
			
			int n=sc.nextInt();
			if(n==5) {
				System.out.println("Thank You...");
				break;
			}else if(n==1) {
				add();
			}else if(n==2) {
				int val=poll();
				System.out.println("Deleted element is : "+val);
			}else if(n==3) {
				int val=peek();
				System.out.println("Top element is : "+val);
			}else if(n==4) {
				
				System.out.println(stk1.size()==0);
			}
			
		}
	}
	
	static int peek() {
		if(stk1.size()==0) {
			System.out.println("Stack is empty..");
			return Integer.MIN_VALUE;
		}
		if(stk1.size()==1) {
			int val=stk1.pop();
			stk1.push(val);
			return val;
		}
		int ans=0;
		while(stk1.size()>0) {
			 ans=stk1.pop();
			stk2.push(ans);	
		}
		
		while(stk2.size()>0) {
			int val=stk2.pop();
			stk1.push(val);
		}
		return ans;
		
	}
	
	static int poll() {
		
		if(stk1.size()==0) {
			System.out.println("Stack is empty..");
			return Integer.MIN_VALUE;
		}
		if(stk1.size()==1) {
			int val=stk1.pop();
			return val;
		}
		
		while(stk1.size()>1) {
			int val=stk1.pop();
		    stk2.push(val);
			
		}
		int ans=stk1.pop();
		while(stk2.size()>0) {
			int val=stk2.pop();
			stk1.push(val);
		}
		return ans;
		
	}
	
	static void add() {
		System.out.println("Enter data..");
		int data=sc.nextInt();
		stk1.push(data);
	}
	

}
