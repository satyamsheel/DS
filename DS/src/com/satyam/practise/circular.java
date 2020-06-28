public void circular{
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
    Node n=head;
    if(head==null){
      System.out.println("Empty node");
    }else{
      do{
        System.out.print(n.data+" ");
        n=n.next;
      }while(n!=head);
    }
  }

  public static void main(String args[]){
    circular Circular=new circular();
    Circular.push(12);
    Circular.push(13);
    Circular.push(15);
    Circular.push(16);
    Circular.showlist();
  }
}
