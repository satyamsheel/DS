package com.satyam.LinkedList;

public class LoopDetection {
	
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
	
	public boolean detectLoop(){
		Node slow_pointer=head;
		Node fast_pointer=head;
		if(head!=null){
			while(fast_pointer!=null && fast_pointer.next!=null){
				slow_pointer=slow_pointer.next;
				fast_pointer=fast_pointer.next.next;
				if(slow_pointer==fast_pointer){
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		LoopDetection loopdetection=new LoopDetection();
		loopdetection.push(23);
		loopdetection.push(25);
		loopdetection.push(89);
		loopdetection.push(255);
		loopdetection.push(859);
		loopdetection.push(265);
		loopdetection.push(897);
		
		loopdetection.head.next.next.next.next=loopdetection.head;
		if(loopdetection.detectLoop()){
			System.out.println("Loop Found");
		}else
		{
			System.out.println("No loop");
		}
		

	}

}
