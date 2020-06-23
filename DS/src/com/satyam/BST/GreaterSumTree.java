package com.satyam.BST;

class GreaterSumTree{
	  Node root;

	  class Node{
	    int key;
	    Node left,right;
	    Node(int key){
	      this.key=key;
	      right=left=null;
	    }
	  }

	  GreaterSumTree(){
	    root=null;
	  }

	  public void push(int key){
	    root=pushRec(root,key);
	  }

	  Node pushRec(Node root,int key){
	    if(root==null){
	      root=new Node(key);
	      return root;
	    }
	    if(key<root.key){
	      root.left=pushRec(root.left,key);
	    }else if(key>root.key){
	      root.right=pushRec(root.right,key);
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

	  public void greater(){
	    greaterRec(root);
	  }

	  public static int sum=0;
	  public void greaterRec(Node root){
	    if(root!=null){
	      greaterRec(root.right);
	      int temp=root.key;
	      root.key=sum;
	      sum=sum+temp;
	      greaterRec(root.left);
	    }else return;


	  }




	  public static void main(String args[]){
	    GreaterSumTree greatersumtree=new GreaterSumTree();
	    greatersumtree.push(1);
	    greatersumtree.push(2);
	    greatersumtree.push(7);
	    greatersumtree.push(11);
	    greatersumtree.push(15);
	    greatersumtree.push(29);
	    greatersumtree.push(35);
	    greatersumtree.push(40);

	    System.out.println("In order Tree");

	    greatersumtree.show();

	    greatersumtree.greater();

	    System.out.println("greater func done");

	    greatersumtree.show();

	  }
	}

