package Assignment03;

import Assignment03.Pro01.Node;

public class Pro05 {
	
	// Merge Two Sorted Linked List
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head1=null,tail1=null,head2=null,tail2=null;
	
	public static void main(String[] args) {
		
		addNodeFirst(10);
		addNodeFirst(20);
		addNodeFirst(30);
		addNodeFirst(40);
		addNodeFirst(50);
		addNodeFirst(60);
		
		addNodeSecond(5);
		addNodeSecond(15);
		addNodeSecond(25);
		addNodeSecond(35);
		addNodeSecond(45);
		addNodeSecond(55);
		addNodeSecond(65);
		
		System.out.println("List 1 is : ");
		printList(head1);
		
		System.out.println("List 2 is : ");
		printList(head2);
		
		
		Node mergeList=mergeList(head1,head2);
		
		System.out.println("Merge List is : ");
		printList(mergeList);
		
		
		
	}
	
	static Node mergeList(Node h1,Node h2) {
		
		if(h1==null) {
			return h2;
		}
		
		if(h2==null) {
			return h1;
		}
		
		Node mergeHead=null,mergeTail=null;
		
		while(h1!=null && h2!=null) {
			
			Node n=null;
			if(h1.data<h2.data) {
				n=new Node(h1.data);
				h1=h1.next;
			}else {
				n=new Node(h2.data);
				h2=h2.next;
			}
			
			if(mergeHead==null) {
				mergeHead=n;
				mergeTail=n;
			}else {
				mergeTail.next=n;
				mergeTail=n;
			}
		}
		
		if(h1!=null) {
			mergeTail.next=h1;
		}
		
		if(h2!=null) {
			mergeTail.next=h2;
		}
		return mergeHead;
	}
	
	static void printList(Node head) {
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	static void addNodeFirst(int data) {
		Node n=new Node(data);
		
		if(head1==null) {
			head1=n;
			tail1=n;
		}else {
			tail1.next=n;
			tail1=n;
		}
	}
	
	static void addNodeSecond(int data) {
		Node n=new Node(data);
		
		if(head2==null) {
			head2=n;
			tail2=n;
		}else {
			tail2.next=n;
			tail2=n;
		}
	}

}
