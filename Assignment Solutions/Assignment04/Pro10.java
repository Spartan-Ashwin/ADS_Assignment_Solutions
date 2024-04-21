package Assignment04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Assignment04.Pro8.Node;

public class Pro10 {
	
	// 10.Print Head node of every node in Binary Tree
	
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
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {1,2,3,4,5,6,7};
		
		buildTree(arr);
		
		System.out.println("Print Tree Levelwise");
		
		printLevelWise(head);
		
		printHeadNode(head);
		
	}
	
	static  void printHeadNode(Node temp) {
		
		if(temp==null) {
			return;
		}
		
		if(temp.left!=null) {
			
			System.out.println("Head of "+ temp.left.data+" is "+temp.data);
		}
		
		if(temp.right!=null) {
			
			System.out.println("Head of "+ temp.right.data+" is "+temp.data);
		}
		
		printHeadNode(temp.left);
		printHeadNode(temp.right);
	}
	
	static void printLevelWise(Node head) {
		
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
