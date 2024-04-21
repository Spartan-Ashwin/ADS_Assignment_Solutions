package Assignment04;

import java.util.*;

public class Pro3 {
	
	
	//3.Delete a node in a Doubly Linked List in java
	
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
		
		System.out.println("Which Number you want to delete");
		int num=sc.nextInt();
		
		deleteNode(num);
		printList();
		
		
		

	}
	static void deleteNode(int n) {
		
		Node temp=head;
		while(temp!=null) {
			
			if(temp.data==n) {
				break;
			}
			temp=temp.next;
		}
		
		if(temp.prev==null) {
			head=temp.next;
			return ;
		}
		
		if(temp.next==null) {
			
			temp.prev.next=null;
			return;
		}
		
		if(temp!=null) {
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
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
