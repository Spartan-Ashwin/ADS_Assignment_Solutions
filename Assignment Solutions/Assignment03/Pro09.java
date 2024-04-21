package Assignment03;

import java.util.Scanner;

public class Pro09 {

		// Nth Element from last
	
static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null,tail=null;
	static private Scanner sc=new Scanner(System.in);
	
	public static void main(String[] agrs) {
		
	   addNode(10);
	   addNode(20);
	   addNode(30);
	   addNode(40);
	   addNode(50);
	   addNode(60);
	   addNode(70);
	   printList(head);
	   System.out.println("Enter position of elemet for last");
	   int k=sc.nextInt();
	   
	   findKthElement(head,k);
	   
	   
	  
	}
	
	static void  findKthElement(Node head,int k) {
		
		if(head==null || k<0) {
			System.out.println("Sorry Bro....");
			return;
		}
		
		Node slow=head;
		Node fast=head;
		
		for(int i=1;i<k;i++) {
			fast=fast.next;
		}
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		
		System.out.println("Kth Element for last is "+slow.data);
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
