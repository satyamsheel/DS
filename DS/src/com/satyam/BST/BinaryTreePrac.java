package com.satyam.BST;

import java.util.*;

public class BinaryTreePrac {

	static Node root;
	
	static class Node{
		int key;
		Node left,right;
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	
	static void inorder(Node temp) {
		if(temp==null) {
			return;
		}
		inorder(temp.left);
		System.out.print(temp.key+" " );
		inorder(temp.right);
	}
	
	static void insert(Node temp,int key) {
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(temp);
		
		while(!queue.isEmpty()) {
			temp=queue.peek();
			queue.remove();
			
			if(temp.left==null) {
				temp.left=new Node(key);
				break;
			}else
				queue.add(temp.left);
			if(temp.right==null) {
				temp.right=new Node(key);
				break;
			}else
				queue.add(temp.right);
		}
		
	}
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(11);
		root.right=new Node(9);
		root.left.left=new Node(7);
		root.right.right=new Node(8);
		root.right.left=new Node(15);
		
		System.out.println("Inorder tavaersla before");
		inorder(root);
		
		insert(root,14);
		
		System.out.println("Inorder After");
		inorder(root);

	}

}
