package com.satyam.BST;

public class ContinousTree {
	
	static Node root;
	static class Node{
		int key;
		Node left,right;
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
	static boolean continuous(Node temp) {
		if(temp==null)
			return true;
		
		if(temp.left==null && temp.right==null) {
			return true;
		}
		
		if(temp.left==null)
			return (Math.abs(temp.key-temp.right.key)==1 && continuous(temp.right));
		
		if(temp.right==null)
			return (Math.abs(temp.key-temp.left.key)==1 && continuous(temp.left));
		
		return (Math.abs(temp.key-temp.left.key)==1
				&& Math.abs(temp.key-temp.right.key)==1
				&& continuous(temp.left)
				&& continuous(temp.right));
	}
	

	public static void main(String[] args) {
		root=new Node(3);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(4);
		root.right.right=new Node(5);
		
		if(continuous(root)) {
			System.out.println("YES");
		}else
			System.out.println("NO");
		

	}

}
