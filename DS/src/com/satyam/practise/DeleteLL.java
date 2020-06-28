class DeleteLL{
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

  public void delete(int data){
    Node n=head;
    Node prev=null;
    while(n.data!=data ){
      prev=n;
      n=n.next;

      if(n==null){
        System.out.println("Non existant");
        return;
      }
    }
    prev.next=n.next;

  }

  public static void main(String args[]){
    DeleteLL deletell=new DeleteLL();
    deletell.push(3);
    deletell.push(5);
    deletell.push(36);
    deletell.push(7);
    deletell.push(45);
    deletell.show();
    deletell.delete(36);
    deletell.show();
  }
}
