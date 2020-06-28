class Node{
  int key;
  Node right,left;
  Node(int key){
    this.key=key;
    right=left=null;
  }
}
class Tree{
    Node root;
    public void show(){
      Node hello=root;
      System.out.print(root.key);
    }

  public static void main(String args[]){
      Tree tree=new Tree();
      tree.root=new Node(1);
      tree.root.left=new Node(2);
      tree.root.right=new Node(3);
      tree.root.left.left=new Node(4);
      tree.root.right.right=new Node(5);

      tree.show();
  }
}
