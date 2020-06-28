class TreeImpl{

  Node root;


  class Node{
    int key;
    Node left,right;
    Node(int key){
      this.key=key;
      left=right=null;
    }
  }

  TreeImpl(){
    root=null;
  }

  void insert(int key){
    root=insertRec(root,key);
  }
  public Node insertRec(Node node,int key){
    if(root==null){
      root=new Node(key);
      return root;
    }

    if(key<root.key){
      root.left=insertRec(root.left,key);
    }else if(key>root.key){
      root.right=insertRec(root.right,key);
    }
    return root;

  }

  void show(){
    inOrderShow(root);
  }

  void inOrderShow(Node node){
    if(root!=null){
      inOrderShow(root.left);
      System.out.println(root.key);
      inOrderShow(root.right);
    }
  }

  public static void main(String args[]){

    TreeImpl treeimpl=new TreeImpl();
    treeimpl.insert(50);
    treeimpl.insert(30);
    treeimpl.insert(20);
    treeimpl.insert(40);
    treeimpl.insert(70);
    treeimpl.insert(60);
    treeimpl.insert(80);

    treeimpl.show();


  }


}
