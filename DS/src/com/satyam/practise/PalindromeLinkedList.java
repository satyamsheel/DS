class PalindromeLinkedList{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      next=null;
    }
  }
public void push(int data){
  Node new_node=new Node(data);
  new_node.next=head;
  head=new_node;
}

public void show(){
  Node n=head;
  while(n!=null){
    System.out.println(n.data+" ");
    n=n.next;
  }
}

public void checkPlindrome(){
  Node slow_ptr=head;
  Node fast_ptr=head;
  while(fast_ptr!=null && fast_ptr.next!=null){
    slow_ptr=slow_ptr.next;
    fast_ptr=fast_ptr.next.next;
  }
  Node ptr1=head;
  Node ptr2=slow_ptr.next;

  Node prev=null;
  Node current=ptr2;
  Node nex;
  while(current!= null){
    nex=current.next;
    current.next=prev;
    prev=current;
    current=nex;
  }
  ptr2=prev;

  boolean d=compare(ptr1,ptr2);
  if(d){
    System.out.println("YES");
  }else
  System.out.println("NO");


}

public boolean compare(Node head1,Node head2){
  Node temp1=head1;
  Node temp2=head2;
  while (temp1 != null && temp2 != null) {
      if (temp1.data == temp2.data) {
          temp1 = temp1.next;
          temp2 = temp2.next;
        } else
        return false;
      }
       if (temp1 == null && temp2 == null)
           return true;
       return false;
}


  public static void main(String args[]){
    PalindromeLinkedList pll=new PalindromeLinkedList();
    pll.push(1);
    pll.push(2);
    pll.push(3);
    pll.push(4);
    pll.push(3);
    pll.push(2);
    pll.push(1);
    pll.show();
    pll.checkPlindrome();

  }
}
