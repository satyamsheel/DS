package com.satyam.LinkedList;

public class NthLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public  void push(int data){
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	public int findnode(int node){
		Node temp=head;
		int count=0;
		while(temp!= null){
			if(count==node){
				return temp.data;
			}
			count++;
			temp=temp.next;
		}
		assert(false);
		return 0;
	}

	public static void main(String[] args) {
		NthLinkedList nthlinkedlist=new NthLinkedList();
		nthlinkedlist.push(23);
		nthlinkedlist.push(25);
		nthlinkedlist.push(89);
		nthlinkedlist.push(255);
		nthlinkedlist.push(859);
		nthlinkedlist.push(265);
		nthlinkedlist.push(897);
		
		
		System.out.println(nthlinkedlist.findnode(10));
	}

}
