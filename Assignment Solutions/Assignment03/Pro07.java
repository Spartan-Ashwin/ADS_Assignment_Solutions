package Assignment03;

import Assignment03.Pro06.Node;

public class Pro07 {
	
	//Detech Loop in Linked List
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null;
	
	public static void main(String[] args) {
		
		
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node n6=new Node(60);
		Node n7=new Node(70);
		
		head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n3;
		
		System.out.println(isLoopExist(head));
	}
	
	static boolean isLoopExist(Node head) {
		
		Node slow=head.next;
		Node fast=head.next;
		
		while(fast!=null && fast.next!=null) {
			
			if(slow==fast) {
				return true;
			}
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return false;
	}

}
