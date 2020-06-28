class SwapNode{

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

  public void showlist(){
    Node tnode=head;
    while(tnode!=null){
      System.out.println(tnode.data);
      tnode=tnode.next;
    }
  }

  public void swap(int x,int y){
    if(x==y)
    return ;

    Node prevx=null,currX=head;
    while(currX!=null && currX.data!=x){
      prevx=currX;
      currX=currX.next;
    }
    Node prevy=null,currY=head;
    while(currY!=null && currY.data!=y){
      prevy=currY;
      currY=currY.next;
    }
    if(currY == null || currX == null)
    return;

    if(prevx!=null)
    {
      prevx.next=currY;
    }else
    head=currY;

    if(prevy!=null){
      prevy.next=currX;
    }else
    head=currX;

    Node temp=currX.next;
    currX.next=currY.next;
    currY.next=temp;


  }

  public static void main(String args[]){
    SwapNode swapnode=new SwapNode();

    swapnode.push(1);
    swapnode.push(4);
    swapnode.push(15);
    swapnode.push(16);
    swapnode.push(3);
    swapnode.push(8);
    swapnode.push(18);

    swapnode.showlist();

    swapnode.swap(15,3);

    swapnode.showlist();
  }
}
