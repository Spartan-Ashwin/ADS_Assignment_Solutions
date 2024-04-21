package Assignment03;

import Assignment03.Pro01.Node;

public class Pro10 {
	
static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null,tail=null;
	
	public static void main(String[] agrs) {
		
	   addNode(1);
	  addNode(2);
	   addNode(35);
	   addNode(2);
	   addNode(1);
	   
	   printList(head);
	   
	   System.out.println(isPalindrome(head));
	}
	
	static boolean isPalindrome(Node head) {
		
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		
		Node pre=null;
		Node temp=slow;
		while(temp!=null) {
			Node t=temp.next;
			temp.next=pre;
			pre=temp;
			temp=t;
		}
	
		
		while(pre!=null) {
			
			
			if(head.data!=pre.data) {
				return false;
			}
		
			head=head.next;
			pre=pre.next;
		}
		return true;
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
