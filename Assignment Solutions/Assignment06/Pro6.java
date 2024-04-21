package Assignment06;
import java.util.Scanner;

public class Pro6 {
	
	// Implement Stack
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	static private Scanner sc=new Scanner(System.in);
	static Node head=null, tail=null;
	static int size=0;
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
				System.out.println("Size of Linked List : "+size);
			}
		}
	}
	
	static int peek() {
		
		if(head==null) {
			return Integer.MIN_VALUE;
		}else {
			return head.data;
		}
	}
	
	static int pop() {
		
		if(head==null) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}else {
			int val=head.data;
			size--;
			head=head.next;
			return val;
		}
	}
	
	static void push() {
		System.out.println("Enter data : ");
		int data=sc.nextInt();
		Node n=new Node(data);
		size++;
		if(head==null) {
			head=n;
			tail=n;
		}else {
			n.next=head;
			head=n;
			
		}
	}

}
