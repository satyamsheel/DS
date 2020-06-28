class AVL{
  Node root;
  class Node{
    int key,height;
    Node left,right;
    Node(int key){
      this.key=key;
      height=1;
    }
  }

    public void insert(int key){
      root=insertRec(root,key);
    }

    Node insertRec(Node root,int key){
      if(root==null){
        root=new Node(int key);
        retuen root;
      }
      if(key<root.key){

      }
    }

  public static void main(String args[]){
    AVL avl=new AVL();
    avl.push(2);

  }
}
