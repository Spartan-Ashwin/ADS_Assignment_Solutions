package Assignment03;

import Assignment03.Pro01.Node;

public class Pro06 {
	
	// Middle Of LinkeList
	
	
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
	   
	   
	   System.out.println("Middle of Linked List is : ");
	   findMiddle(head);
	}
	
	static void findMiddle(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		System.out.println(slow.data);
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
