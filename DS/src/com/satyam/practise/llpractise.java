class llpractise{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      next=null;
    }
  }

  public void push(int data)
  {
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

  public void pushAfter(Node prev,int data){
    if(prev==null){
      System.out.println("cant be null");
      return;
    }
    Node new_node=new Node(data);
    new_node.next=prev.next;
    prev.next=new_node;
  }


  public void showlist(){
    Node n=head;
    while(n!=null){
      System.out.println(n.data+" ");
      n=n.next;
    }
  }

  public static void main(String args[]){
    llpractise LLpractise=new llpractise();
    LLpractise.push(4);
    LLpractise.push(5);
    LLpractise.push(7);
    LLpractise.push(8);
    LLpractise.push(9);
    LLpractise.push(10);
    LLpractise.showlist();
    System.out.println("only push");
    LLpractise.append(10);
    LLpractise.append(13);
    LLpractise.append(16);
    LLpractise.append(18);
    LLpractise.pushAfter(LLpractise.head.next.next.next.next,500);
    LLpractise.showlist();

  }
}
