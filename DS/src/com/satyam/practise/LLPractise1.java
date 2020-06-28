class LLPractise1{

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
      System.out.print(n.data+" ");
      n=n.next;
    }
    System.out.println();
  }

  public void pushAfter(Node prev,int value){
    if(prev==null){
      System.out.println("Not posssible");
      return;
    }

    Node new_node=new Node(value);
    new_node.next=prev.next;
    prev.next=new_node;
  }

  public void append(int data){
    Node n=head;
    while(n.next!=null){
      n=n.next;
    }
    Node new_node=new Node(data);
    n.next=new_node;
  }

public static void main(String args[]){
  LLPractise1 llpractise=new LLPractise1();
  llpractise.push(3);
  llpractise.push(8);
  llpractise.push(9);
  llpractise.push(11);
  llpractise.push(12);
  llpractise.show();
  llpractise.pushAfter(llpractise.head.next.next,199);
  llpractise.pushAfter(llpractise.head.next.next.next,133);
  llpractise.show();
  llpractise.append(200);
  llpractise.show();

}

}
