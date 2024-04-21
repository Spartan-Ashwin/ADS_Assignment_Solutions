package Assignment03;

import Assignment03.Pro01.Node;

public class Pro03 {
	
	// Reverse Singly Linked List LinkedList
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	
	
	static Node head=null,tail=null;
	
	public static void main(String[] agrs) {
		
	   addNode(10);
	   addNode(20);
	   addNode(30);
	   addNode(40);
	   addNode(50);
	   
	   printList(head);
	   
	   System.out.println("Reverse Linked List is ");
	   head=reverse(head);
	   printList(head);
	}
	
	static  Node reverse(Node head) {
		
		Node temp=head;
		Node pre=null;
		
		while(temp!=null) {
			
			Node t=temp.next;
			temp.next=pre;
			pre=temp;
			temp=t;
		}
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
	
	static void addNode(int data) {
		Node n=new Node(data);
		
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			tail=n;
		}
	}

}
