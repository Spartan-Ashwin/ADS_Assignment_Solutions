package Assignment06;

import java.util.*;



public class Pro9 {
	
	//9. Java Program to Implement Stack Using Two Queues
	
	
	static private Scanner sc=new Scanner(System.in);
	
	static int size=0;
	
	static Queue<Integer> q1=new LinkedList<>();
	static Queue<Integer> q2=new LinkedList<>();
	
	public static void main(String[] args) {
		
		
		while(true) {
			
			System.out.println("1.Push()");
			System.out.println("2.Pop()");
			System.out.println("3.Peek()");
			System.out.println("4.isEmpty()");
			System.out.println("5.EXIT");
			int n=sc.nextInt();
			if(n==5) {
				System.out.println("Thank You...");
				break;
			}else if(n==1) {
				push();
			}else if(n==2) {
				int val=pop();
				System.out.println("You poped the element is "+val);
			}else if(n==3) {
				int val=peek();
				System.out.println("Top Element is "+val);
			}else if(n==4) {
				System.out.println("Size of Stack : "+q1.size());
			}
		}
	}
	
	static int peek() {
		if(q1.size()==0) {
			System.out.println("Stack is Empty..");
			return Integer.MIN_VALUE;
		}
		
		if(q1.size()==1) {
			
			int val=q1.poll();
			q1.add(val);
			return val;
		}
		while(q1.size()>1) {
			int val=q1.poll();
			q2.add(val);
		}
		
        int ans=q1.poll();
        q2.add(ans);
		
		while(q2.size()>0) {
			q1.add(q2.poll());
		}
		return ans;
		
	}
	
	static void push() {
		
		System.out.println("Enter data");
		int data=sc.nextInt();
		q1.add(data);
	}
	
	static int pop() {
		
		if(q1.size()==0) {
			System.out.println("Stack is Empty..");
			return Integer.MIN_VALUE;
		}
		
		if(q1.size()==1){
			return q1.poll();
		}
		while(q1.size()>1) {
			int val=q1.poll();
			q2.add(val);
		}
		int ans=q1.poll();
		
		while(q2.size()>0) {
			q1.add(q2.poll());
		}
		return ans;
	}
}
