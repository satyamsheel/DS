class LinkedList{
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

      Node last=head;
      while(last.next!=null){
        last=last.next;
      }
      last.next=new_node;
      return;
    }

    public void insertafter(Node prev,int data){
      if(prev==null){
        System.out.println("cant be null");
        return;
      }
      Node new_node=new Node(data);
      new_node.next=prev.next;
      prev.next=new_node;
    }

    public void output(){
      Node tnode=head;
      while(tnode!=null){
        System.out.println(tnode.data);
        tnode=tnode.next;
      }
    }
  public static void main(String args[]){
    LinkedList linkedlist=new LinkedList();
    linkedlist.push(5);
    linkedlist.append(8);
    linkedlist.insertafter(linkedlist.head.next,45);
    linkedlist.push(96);
    linkedlist.output();
  }
}
