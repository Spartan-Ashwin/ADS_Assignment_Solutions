package Assignment04;

public class Pro01 {

	// 1.Doubly Linked List Insertion in java
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
		
		
		int[] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			
			addElement(arr[i]);
		}
		
		printList();
		

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
