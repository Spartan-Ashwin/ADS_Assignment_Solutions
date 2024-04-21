package Assignment04;

import Assignment04.Pro01.Node;

public class Pro2 {
	
	// 2.Reverse a Doubly Linked List in java
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null, tail=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			
			addElement(arr[i]);
		}
		
		System.out.println("Before Reversing");
		printList();
		head=reverseList();
		System.out.println("After Reversing");
		printList();
		

	}
	
	static Node reverseList() {
		
		Node pre=null;
		Node temp=head;
		while(temp!=null) {
			Node t=temp.next;
			temp.next=pre;
			pre=temp;
			temp=t;
		}
		
		return pre;
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
			
			tail=n;
		}
	}


}
