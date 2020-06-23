package com.satyam.CircularLinkedList;

public class CLLsplit {
	static Node head=null;
	Node tail=null;
	static Node head1;
	static Node head2;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public void push(int data){
		Node new_node=new Node(data);
		if(head==null){
			head=new_node;
			tail=new_node;
			new_node.next=head;
		}else{
			Node temp=head;
			new_node.next=temp;
			head=new_node;
			tail.next=head;
		}
	}
	
	public void showList(Node current){
		if(current==null){
			System.out.println("Empty ll");
		}else{
			do{
				System.out.println(current.data+" ");
				current=current.next;
			}while(current!=head);
			System.out.println();
		}
		
	}
	
	public void split(){
		Node slow_ptr=head;
		Node fast_ptr=head;
		
		if(head==null){
			return;
		}
		
		while(fast_ptr!=head && fast_ptr.next.next!=head){
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
		}
		
		if(fast_ptr.next.next==head){
			fast_ptr=fast_ptr.next;
		}
		
		head1=head;
		
		if(head.next!=head){
			head2=slow_ptr.next;
		}
		
		fast_ptr.next=slow_ptr.next;
		slow_ptr.next=head;
		
	}

	public static void main(String[] args) {
		CLLsplit cllsplit=new CLLsplit();
		cllsplit.push(4);
		cllsplit.push(5);
		cllsplit.push(6);
		cllsplit.push(7);
		cllsplit.push(8);
		cllsplit.showList(head);
		
		cllsplit.split();
		System.out.println("/");
		
		cllsplit.showList(head1);
		System.out.println("/");
		cllsplit.showList(head2);
	}

}
