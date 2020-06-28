class LinkedListt{

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

  public void showlist(){
    Node n=head;
    while(n!=null){
      System.out.println(n.data+" ");
      n=n.next;
    }
  }

  public void append(int data){
    Node new_node=new Node(data);
    if(head==null){
      head=new Node(data);
      return;
    }
    new_node.next=null;
    Node last=head;
    while(last.next!=null){
      last=last.next;
    }
    last.next=new_node;
    return;
  }

public static void main(String args[]){
  LinkedListt llp=new LinkedListt();
  llp.push(5);
  llp.push(8);
  llp.push(10);
  llp.push(12);

  llp.append(67);
  llp.showlist();
}

}
