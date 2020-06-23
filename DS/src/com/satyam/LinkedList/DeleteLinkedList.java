package com.satyam.LinkedList;

public class DeleteLinkedList {
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
	
	public void printlist(){
		Node tnode=head;
		while(tnode!=null){
			System.out.println(tnode.data+" ");
			tnode=tnode.next;
		}
	}
	
	public void deletealllinkedlist(){
		head=null;
	}

	public static void main(String[] args) {
		DeleteLinkedList deletelinkedlist=new DeleteLinkedList();
		deletelinkedlist.push(2);
		deletelinkedlist.push(3);
		deletelinkedlist.push(2);
		deletelinkedlist.push(3);
		
		
		deletelinkedlist.printlist();
		
		deletelinkedlist.deletealllinkedlist();
		

	}

}
