package com.satyam.LinkedList;

public class LinkedList {
	
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
	
	public void append(int data){
		Node new_node=new Node(data);
		
		if(head==null){
			head=new Node(data);
			return;
		}
		
		new_node.next=null;
		
		//check if other node exist
		Node last=head;
		while(last.next!=null)
			last=last.next;
		
		last.next=new_node;
		return;
	}
	public void insertAfter(Node prev_node,int data){
		if(prev_node==null){
			System.out.println("Node cant be null");
			return;
		}
		
		Node new_node=new Node(data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		
	}
	
	public void printList(){
		Node tnode=head;
		while(tnode!=null){
			System.out.println(tnode.data+"");
			tnode=tnode.next;
		}
	}
	
	

	public static void main(String[] args) {
		LinkedList linkedlist=new LinkedList();

        // Insert 6.  So linked list becomes 6->NUllist
		linkedlist.append(6); 
		  
	        // Insert 7 at the beginning. So linked list becomes 
	        // 7->6->NUllist 
		linkedlist.push(7); 
	  
	        // Insert 1 at the beginning. So linked list becomes 
	        // 1->7->6->NUllist 
		linkedlist.push(1); 
	  
	        // Insert 4 at the end. So linked list becomes 
	        // 1->7->6->4->NUllist 
		linkedlist.append(4); 
	  
	        // Insert 8, after 7. So linked list becomes 
	        // 1->7->8->6->4->NUllist 
		linkedlist.insertAfter(linkedlist.head.next, 8); 
	  
	        System.out.println("\nCreated Linked list is: "); 
	        linkedlist.printList(); 

	}

}
