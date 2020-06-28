class CLLInsertion{
  Node head=null;
  Node tail=null;

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

  public void showlist(){
    Node current=head;
    if(head==null){
      System.out.println("Empty list ");
    }else{
      do{
        System.out.print(current.data+" ");
        current=current.next;
      }while(current!=head);
      System.out.println();
    }
  }

  public static void main(String args[]){
    CLLInsertion cllinsertion=new CLLInsertion();
    cllinsertion.push(3);
    cllinsertion.push(4);
    cllinsertion.push(5);
    cllinsertion.push(6);
    cllinsertion.showlist();
  }
}
