package Assignment04;

import java.util.Scanner;

public class Pro6 {
	
	// 6.Insert value in sorted way in a sorted doubly linked list in java
	
	
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null, tail=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			
			addElement(arr[i]);
		}
		
		printList();
		
		System.out.println("Insert Element is Sorted Doubly Linked List");
		int num=sc.nextInt();
		head=insertIntoSorted(num);
		printList();
		
		

	}
	static Node insertIntoSorted(int data) {
		
		Node n=new Node(data);
		
		if(head==null) {
			head=n;
			tail=n;
			return head;
		}
		
		if(n.data<head.data) {
			n.next=head;
			head.prev=n;
			head=n;
			return n;
		}
		
		Node pre=null,curr=head;
		while(curr!=null) {
			if(curr.data>n.data) {
				break;
			}
			pre=curr;		
			curr=curr.next;
		}
		
		if(curr==null) {
			pre.next=n;
			n.prev=pre;
		}else {
			pre.next=n;
			n.prev=pre;
			n.next=curr;
			curr.prev=n;
		}
		return head;
		
	}
	
	static void printList() {
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
		}
		
		else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}

}
