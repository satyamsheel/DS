package com.satyam.BST;

class Roots{


	  class Node{
	    int key;
	    Node right,left;
	    Node(int key){
	      this.key=key;
	      right=left=null;
	    }
	  }

	  Node root;

	  Roots(){
	    root=null;
	  }

	  public void insert(int key){
	    root=insertRec(root,key);
	  }

	  public Node insertRec(Node root,int key){
	    if(root==null){
	      root=new Node(key);
	      return root;
	    }
	    if(key<root.key){
	      root.left=insertRec(root.left,key);
	    }else if(key>root.key){
	      root.right=insertRec(root.right,key);
	    }
	    return root;
	  }

	  public void inOrder(){
	    inOrderRec(root);
	  }

	  public void inOrderRec(Node root){
	    if(root!=null){
	      inOrderRec(root.left);
	      System.out.println(root.key);
	      inOrderRec(root.right);
	    }
	  }

	  public static void main(String args[]){

	    Roots root=new Roots();
	    root.insert(50);
	    root.insert(30);
	    root.insert(20);
	    root.insert(40);
	    root.insert(70);
	    root.insert(60);
	    root.insert(80);

	    root.inOrder();

	  }
	}

