package com.satyam.BST;

class RootsDelete{
	  Node root;

	  class Node{
	    int key;
	    Node left,right;
	    Node(int key){
	      this.key=key;
	      left=right=null;
	    }
	  }
	  RootsDelete(){
	    root=null;
	  }

	  public void insert(int key){
	    root=insertRec(root,key);
	  }

	  Node insertRec(Node root,int key){
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

	  public void show(){
	    showRec(root);
	  }

	  public void showRec(Node root){
	    if(root!=null){
	      showRec(root.left);
	      System.out.println(root.key);
	      showRec(root.right);
	    }
	  }

	  public void deleteNode(int key){
	    root=deleteNodeRec(root,key);
	  }

	  Node deleteNodeRec(Node root,int key){
	    if(root==null)
	    return root;

	    if(key<root.key)
	    root.left=deleteNodeRec(root.left,key);
	    else if(key>root.key)
	    root.right=deleteNodeRec(root.right,key);

	    else{
	      if(root.left==null)
	      return root.right;
	      else if(root.right==null)
	      return root.left;

	      root.key=minVal(root.right);
	      root.right=deleteNodeRec(root.right,root.key);
	    }
	    return root;
	  }

	  public int minVal(Node root){
	    int minv=root.key;
	    while(root.left!=null){
	      minv=root.left.key;
	      root=root.left;
	    }
	    return minv;
	  }



	  public static void main(String args[]){
	    RootsDelete rootsdelete =new RootsDelete();

	    rootsdelete.insert(50);
	    rootsdelete.insert(30);
	    rootsdelete.insert(20);
	    rootsdelete.insert(40);
	    rootsdelete.insert(70);
	    rootsdelete.insert(60);
	    rootsdelete.insert(80);

	    System.out.println("The orignal tree");

	    rootsdelete.show();

	    rootsdelete.deleteNode(40);

	    System.out.println("After deletion");

	    rootsdelete.show();

	  }
	}

