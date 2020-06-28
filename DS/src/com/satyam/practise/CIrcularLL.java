class CIrcularLL{
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
      new_node.next=head;
      head=new_node;
      tail.next=head;
    }
  }

  public void showlist(){
    Node n=head;
    if(n==null){
      System.out.println("Node empty");
    }else{
      do{
        System.out.println(n.data+" ");
        n=n.next;
      }while(n!=head);
    }
  }

  public static void main(String args[]){
    CIrcularLL circularll=new CIrcularLL();
    circularll.push(3);
    circularll.push(6);
    circularll.push(7);
    circularll.push(8);
    circularll.showlist();
  }
}
