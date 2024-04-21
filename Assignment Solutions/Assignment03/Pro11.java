package Assignment03;

public class Pro11 {
	
	// Addition of Two Linked List
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	static Node head1=null,tail1=null,head2=null,tail2=null;
	
	public static void main(String[] args) {
		
		addNodeFirst(1);
		addNodeFirst(2);
		addNodeFirst(3);
		addNodeFirst(4);
		addNodeFirst(5);
		
		
		
		addNodeSecond(1);
		addNodeSecond(2);
		addNodeSecond(3);
		addNodeSecond(4);
		addNodeSecond(5);
		addNodeSecond(6);
		
		System.out.println("List 1 is : ");
		printList(head1);
		
		System.out.println("List 2 is : ");
		printList(head2);
		System.out.println();
		System.out.println("Addition of this two list are");
		Node head=addList(head1,head2);
		printList(head);
		
	
	}
	
	static Node addList(Node h1,Node h2) {
		
		if(h1==null) {
			return h2;
		}
		if(h2==null) {
			return h1;
		}
		h1=reverseList(h1);
		h2=reverseList(h2);
		
		Node head=null;
		int carry=0;
		while(h1!=null && h2!=null) {
			
			int val1=h1.data;
			int val2=h2.data;
			int ans=val1+val2+carry;
			
			int val=ans%10;
			carry=ans/10;
			
			Node n=new Node(val);
			if(head==n) {
				head=n;
			}else {
				n.next=head;
				head=n;
			}
			h1=h1.next;
			h2=h2.next;
		}
		
		while(h1!=null) {
			int val=h1.data+carry;
			int ans=val%10;
			carry=val/10;
			Node n=new Node(ans);
			n.next=head;
			head=n;
			h1=h1.next;
		}
		
		
		while(h2!=null) {
			int val=h2.data+carry;
			int ans=val%10;
			carry=val/10;
			Node n=new Node(ans);
			n.next=head;
			head=n;
			h2=h2.next;
		}
		return head;
	}
	
	static Node reverseList(Node head) {
		
		Node temp=head;
		Node pre=null;
		while(temp!=null) {
			Node t=temp.next;
			temp.next=pre;
			pre=temp;
			temp=t;
		}
		return pre;
	}
	
	static void printList(Node head) {
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	static void addNodeFirst(int data) {
		Node n=new Node(data);
		
		if(head1==null) {
			head1=n;
			tail1=n;
		}else {
			tail1.next=n;
			tail1=n;
		}
	}
	
	static void addNodeSecond(int data) {
		Node n=new Node(data);
		
		if(head2==null) {
			head2=n;
			tail2=n;
		}else {
			tail2.next=n;
			tail2=n;
		}
	}

}
