package Assignment03;

import Assignment03.Pro02.Node;

public class Pro04 {
	
	// Reverse Doubly Linked List 
	
	static class Node{
		
		Node pre;
		Node next;
		int data;
		
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null,tail=null;
	
	public static void main(String[] args) {
		
		addElement(10);
		addElement(20);
		addElement(30);
		addElement(40);
		addElement(50);
		addElement(60);
		addElement(70);
		
		printList(head);
		
		System.out.println("Reverse Linked List is : ");
		head=reverseList(head);
		printList(head);
		
	}
	
	static Node reverseList(Node head) {
		
		Node temp=head;
		Node pre=null;
		
		while(temp!=null) {
			Node t=temp.next;
			temp.next=pre;
			temp.pre=t;
			pre=temp;
			temp=t;
		}
		//pre.pre=null;
		return pre;
	}
	
	
	
	
	static void printList(Node head) {
		
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	static void addElement(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
		    n.pre=tail;
			tail=n;
		}
	}

}
