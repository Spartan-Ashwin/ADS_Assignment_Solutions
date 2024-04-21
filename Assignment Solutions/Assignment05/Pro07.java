package Assignment05;

public class Pro07 {
	
	// Bubble Sort for Linked List by Swapping nodes
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	static Node head=null,tail=null,head1=null,tail1=null;
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
			Node t1=temp;
			Node t2=temp.next;
			for(int j=0;j<size-1-i;j++) {
				
				
				if(t1.data>t2.data) {
					int t=t1.data;
					t1.data=t2.data;
					t2.data=t;
				}
				t1=t2;
				t2=t1.next;
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
			tail=n;
		}
	}

}
