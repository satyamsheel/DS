package com.satyam.BST;

class SOrtedArrayToBST{

	  Node root;
	  class Node{
	    int key;
	    Node left,right;
	    Node(int key){
	      this.key=key;
	      left=right=null;
	    }
	  }

	  SOrtedArrayToBST(){
	    root=null;
	  }

	  public void push(int a[],int b,int n){
	    root=pushRec(root,a,b,n);
	  }

	  Node pushRec(Node root,int a[],int b,int n){
	    if(b>n)
	    return null;
	    int mid=(b+n)/2;
	    root=new Node(a[mid]);

	    root.left=pushRec(root.left,a,b,mid-1);
	    root.right=pushRec(root.right,a,mid+1,n);

	    return root;
	  }

	  public void show(){
	    showRec(root);
	  }

	  public void showRec(Node root){
	    if(root!=null)
	    {
	      showRec(root.left);
	      System.out.println(root.key);
	      showRec(root.right);
	    }
	  }

	  public void preOrder(){
	    preOrderRec(root);
	  }

	  public void preOrderRec(Node root){
	    if(root==null){
	      return;
	    }
	    System.out.println(root.key);
	    preOrderRec(root.left);
	    preOrderRec(root.right);
	  }



	  public static void main(String args[]){

	    SOrtedArrayToBST sortedarraytobst=new SOrtedArrayToBST();
	    int a[]=new int[]{1,2,3,4,5,6,7};
	    int n=a.length;
	    sortedarraytobst.push(a,0,n-1);

	    System.out.println("After Conversion");

	    sortedarraytobst.show();

	    System.out.println("Show Pre Order");

	    sortedarraytobst.preOrder();

	}
	}

