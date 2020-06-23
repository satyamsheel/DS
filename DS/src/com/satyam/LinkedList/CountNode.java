package com.satyam.LinkedList;

public class CountNode {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public void push(int data){
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}

	public int printlinkedlist(){
	Node tnode=head;
	int c=0;
	while(tnode!=null){
		System.out.println(tnode.data+" ");
		tnode=tnode.next;
		c++;
		}
	return c;
	}
	

		
	
	public static void main(String[] args)  {
		CountNode countnode=new CountNode();
		countnode.push(34);
		countnode.push(45);
		countnode.push(75);
		countnode.push(5);
		countnode.push(55);
		
		int p=countnode.printlinkedlist();
		System.out.println("Number of node "+p);
		
		
		

	}

}
