class RemoveDuplicateSorted{
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

  public void showOrignal(){
    Node tnode=head;
    while(tnode!=null){
      System.out.println(tnode.data);
      tnode=tnode.next;
    }
  }

      public void removedata(){
      Node current=head;
      while(current!=null){
        Node temp=current;

        while(temp!=null && temp.data==current.data){
          temp=temp.next;
        }

        current.next=temp;
        current=current.next;
      }
    }

  public static void main(String args[]){
    RemoveDuplicateSorted removeduplicatesorted=new RemoveDuplicateSorted();
    removeduplicatesorted.push(11);
    removeduplicatesorted.push(11);
    removeduplicatesorted.push(11);
    removeduplicatesorted.push(15);
    removeduplicatesorted.push(15);
    removeduplicatesorted.push(16);

    removeduplicatesorted.showOrignal();

    removeduplicatesorted.removedata();

    removeduplicatesorted.showOrignal();

  }
}
