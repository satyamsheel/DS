public class MiddleNode{
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

  public int findmiddle(){
  Node fast_node=head;
  Node slow_node=head;
  if(head!=null){
    while(fast_node!=null && fast_node.next!=null){
      fast_node=fast_node.next.next;
      slow_node=slow_node.next;
    }
    return slow_node.data;
  }
  return 0;
  }

  public static void main(String args[])
  {
      MiddleNode middlenode=new MiddleNode();
      middlenode.push(5);
      middlenode.push(10);
      middlenode.push(545);
      middlenode.push(1034);
      middlenode.push(53);
      middlenode.push(101);
      System.out.println(middlenode.findmiddle());
  }
}
