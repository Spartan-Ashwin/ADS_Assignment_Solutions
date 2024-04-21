package Assignment05;

public class Pro08 {
	
	// .Bubble Sort On Doubly Linked List
	
	
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	static Node head=null,tail=null;
	static int size=0;
	
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		
		for(int i=0;i<arr.length;i++) {
			addElement(arr[i]);
		}
		System.out.println("Before Sorting..");
		printList();
		
		System.out.println("After Sorting..");
		bubblesort();
		printList();
		
	
	}
	
	static void bubblesort() {
		
		for(int i=0;i<size-1;i++) {
			
			Node temp=head;
			Node t=temp;
			for(int j=0;j<size-1-i;j++) {
				
				
				if(t.data>t.next.data) {
					int tt=t.data;
					t.data=t.next.data;
					t.next.data=tt;
				}
				t=t.next;
			}
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
		size++;
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}

}
