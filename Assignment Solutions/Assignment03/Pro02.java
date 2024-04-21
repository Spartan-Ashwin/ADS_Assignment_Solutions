package Assignment03;

public class Pro02 {
	
	// Implementation of Double Linked List
	
	static class Node{
		
		Node pre;
		Node next;
		int data;
		
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head=null,tail=null;
	
	public static void main(String[] args) {
		
		addElement(10);
		addElement(20);
		addElement(30);
		addElement(40);
		addElement(50);
		addElement(60);
		addElement(70);
		
		printListNormal();
		printListReverse();
	}
	
	static void printListReverse() {
		
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.pre;
		}
		System.out.println();
	}
	
	static void printListNormal() {
		
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
		}else {
			tail.next=n;
		    n.pre=tail;
			tail=n;
		}
	}

}
