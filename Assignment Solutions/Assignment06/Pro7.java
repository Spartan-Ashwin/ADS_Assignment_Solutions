package Assignment06;
import java.util.Scanner;
public class Pro7 {
	
	// 7. Java Program to Implement Queue
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null, tail=null;
	static int size=0;
	static private Scanner sc=new Scanner(System.in);

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
				
				System.out.println(size==0);
			}
			
		}
	}
	
	static int peek() {
		
		if(head==null) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}else {
			
			return head.data;
		}
	}
	
	static int poll() {
		
		if(head==null) {
			System.out.println("Queue is Empty..");
			return Integer.MIN_VALUE;
		}else {
			int val=head.data;
			head=head.next;
			size--;
			return val;
		}
	}
	
	static void add() {
		System.out.println("Enter data : ");
		int data=sc.nextInt();
		Node n=new Node(data);
		size++;
		
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			tail=n;
		}
	}

}
