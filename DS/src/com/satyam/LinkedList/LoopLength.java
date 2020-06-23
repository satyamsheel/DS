package com.satyam.LinkedList;

public class LoopLength {
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
	
	public int detectloop(){
		Node slow_ptr=head;
		Node fast_ptr=head;
		while(fast_ptr !=null && fast_ptr.next!=null){
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
			if(slow_ptr==fast_ptr){
				return countLengthOfLoop(slow_ptr);
			}
		}
		return 0;
	}
	
	public int countLengthOfLoop(Node slow_ptr){
		Node temp=slow_ptr;
		int res=1;
		while(temp.next!=null){
			res++;
			temp=temp.next;
		}
		return res;
	}

	public static void main(String[] args) {
		LoopLength looplength=new LoopLength();
		looplength.push(20); 
		looplength.push(4); 
		looplength.push(15); 
		looplength.push(10); 
  
        /*Create loop for testing */
		looplength.head.next.next.next.next = looplength.head; 
  
		System.out.println(looplength.detectloop()); 
		

	}

}
