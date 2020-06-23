package com.satyam.LinkedList;
class PalindromeLL{
  Node head;
  Node fast_ptr;
  Node slow_ptr;
  Node second_half;

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

  public void showlist(){
    Node tnode=head;
    while(tnode!=null)
    {
      System.out.println(tnode.data);
      tnode=tnode.next;
    }
  }

  public boolean checkpalindrome(){
    fast_ptr=head;
    slow_ptr=head;
    Node prev_of_slow_pointer=head;
    Node middle_node=null;
    boolean finalanswer=true;  //for odd number of elements

    if(head!=null && head.next!=null){

      while(fast_ptr!=null && fast_ptr.next!=null){
        fast_ptr=fast_ptr.next.next;
        slow_ptr=slow_ptr.next;
        prev_of_slow_pointer=slow_ptr;
      }

      if(fast_ptr!=null){
        middle_node=slow_ptr;
        slow_ptr=slow_ptr.next;
      }
      second_half=slow_ptr;
      prev_of_slow_pointer.next=null;
      reverse();
      finalanswer=comaprelist(head,second_half);
      reverse();

      if (middle_node != null) {
          prev_of_slow_pointer.next = middle_node;
          middle_node.next = second_half;
        }
        else
          prev_of_slow_pointer.next = second_half;
        }

        return finalanswer;
}

    public void reverse(){
      Node prev=null;
      Node current=second_half;
      Node next;
      while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=prev;
      }
      second_half=prev;
    }

    public boolean comaprelist(Node head1,Node head2){
      Node temp1=head1;
      Node temp2=head2;

      while(temp1!=null & temp2!=null){
        if(temp1.data==temp2.data){
          temp1=temp1.next;
          temp2=temp2.next;
        }else
        return false;
      }
      if(temp1==null && temp2==null){
        return true;
      }
      return false;
    }
//  System.out.print(fast_ptr.data+" "+ slow_ptr.data);
  public static void main(String args[]){
    PalindromeLL palindromell=new PalindromeLL();

    palindromell.push(1);
    palindromell.push(2);
    palindromell.push(3);
    palindromell.push(4);
    palindromell.push(3);
    palindromell.push(2);
    palindromell.push(1);

    System.out.println("The given linkedlist");

    palindromell.showlist();

  boolean expected=palindromell.checkpalindrome();
  if(expected){
    System.out.println("Palindrome");
  }else
  System.out.println("Not a palindrome");
}
}
