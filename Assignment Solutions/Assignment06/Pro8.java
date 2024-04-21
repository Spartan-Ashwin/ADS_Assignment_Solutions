package Assignment06;
import java.util.Scanner;

public class Pro8 {
	
	// 8. Java Program to Implement Dequeue.
	
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	
	static private Scanner sc=new Scanner(System.in);
	static Node head=null,tail=null;
	static int size=0;
	public static void main(String[] args) {
		
		
		while(true) {
			
			System.out.println("1.getFirst()");
			System.out.println("2.getLast()");
			System.out.println("3.removeFirst()");
			System.out.println("4.removeLast()");
			System.out.println("5.addFirst()");
			System.out.println("6.addLast()");
			System.out.println("7.isEmpty()");
			System.out.println("8.EXIT");
			
			int n=sc.nextInt();
			
			if(n==8) {
				System.out.println("Thank You...");
				break;
			}else if(n==1) {
				int val=getFirst();
				System.out.println(val);
			}else if(n==2) {
				int val=getLast();
				System.out.println(val);
			}else if(n==3) {
				int val=romoveFirst();
				System.out.println(val);
			}else if(n==4) {
				int val=removeLast();
				System.out.println(val);
			}else if(n==5) {
				addFirst();
			}else if(n==6) {
				addLast();
			}else if(n==7) {
				
				System.out.println(size==0);
			}
		}
	}
	
	static void addLast() {
		
		System.out.println("Enter data  ");
		int data=sc.nextInt();
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
		size++;
	}
	
	static void addFirst() {
		
		System.out.println("Enter data  ");
		int data=sc.nextInt();
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			n.next=head;
			head.prev=n;
			head=n;
		}
		size++;
	}
	
	static int removeLast() {
		
		if(head==null) {
			System.out.println("Dequeue is Empty..");
			return Integer.MIN_VALUE;
		}
		int val=tail.data;
		tail.prev.next=null;
		size--;
		return val;
	
		
	}
	
	static int romoveFirst() {
		
		if(head==null) {
			System.out.println("Dequeue is Empty..");
			return Integer.MIN_VALUE;
		}
		int val=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return val;
	}
	
	static int getLast() {
		
		if(head==null) {
			System.out.println("Dequeue is Empty..");
			return Integer.MIN_VALUE;
		}
		
		return tail.data;
	}
	
	static int getFirst() {
		
		if(head==null) {
			System.out.println("Dequeue is empty..");
			return Integer.MIN_VALUE;
		}
		
		return head.data;
	}

}
