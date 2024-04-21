package Assignment04;

import java.util.*;

public class Pro7 {
	
	// Tree Traversal
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	static Node head=null;
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		
		buildTree(arr);
		
		System.out.println("Print Tree Levelwise");
		
		printLevelWise();
		
		System.out.println();
		System.out.println("Print Tree Preorder");
		preorder(head);
		System.out.println();
		
		System.out.println("Print Tree Postorder");
		postorder(head);
		System.out.println();
		
		System.out.println("Print Tree Inorder");
		inorder(head);
		System.out.println();
	}
	
	static void inorder(Node temp) {
		
		if(temp==null) {
			return ;
		}
		
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	static void postorder(Node temp) {
		
		if(temp==null) {
			return ;
		}
		
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.data+" ");
	}
	static void preorder(Node temp) {
	   if(temp==null) {
		   return;
	   }
	   System.out.print(temp.data+" ");
	   preorder(temp.left);
	   preorder(temp.right);
	}
	
	static void printLevelWise() {
		
		if(head==null) {
			return;
		}
		
		Queue<Node> q=new LinkedList<>();
		
		Node temp=head;
		q.add(temp);
		
		while(q.size()>0) {
			
			int count=q.size();
			
			for(int i=1;i<=count;i++) {
				Node n=q.poll();
				
				System.out.print(n.data+" ");
				if(n.left!=null) {
					q.add(n.left);
				}
				
				if(n.right!=null) {
					q.add(n.right);
				}
			}
			
			System.out.println();
		}
	}
	
	static void buildTree(int[] arr) {
		
		if(arr.length==0) {
			return ;
		}
		
		Node n=new Node(arr[0]);
		
		if(head==null) {
			head=n;
		}
		
		Queue<Node> q=new LinkedList<>();
		
		q.add(n);
		int i=1;
		
		while(i<arr.length) {
			
			Node node=q.poll();
			
			if(i<arr.length) {
				node.left=new Node(arr[i]);
				q.add(node.left);
			}
			i++;
			if(i<arr.length) {
				node.right=new Node(arr[i]);
				q.add(node.right);
			}
			i++;
			
		}
		
	}

}
