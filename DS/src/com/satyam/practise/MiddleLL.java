class MiddleLL{
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
public void showMiddle(){
  Node slow_ptr=head;
  Node fast_ptr=head;
  while(fast_ptr!=null && fast_ptr.next!=null){
    slow_ptr=slow_ptr.next;
    fast_ptr=fast_ptr.next.next;
  }
  System.out.println(slow_ptr.data);
}

  public static void main(String args[]){
    MiddleLL middlell=new MiddleLL();
    middlell.push(4);
    middlell.push(5);
    middlell.push(6);
    middlell.push(7);
    middlell.push(8);
    middlell.push(11);
    middlell.push(118);
    middlell.show();
    middlell.showMiddle();
  }

}
