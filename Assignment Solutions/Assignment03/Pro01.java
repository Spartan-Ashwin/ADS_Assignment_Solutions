package Assignment03;

public class Pro01 {
	
	// Implementataion of Singly Linked List
	
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
