class ArrayToBst{
  Node root;
    class Node{
      int key;
      Node right,left;
      Node(int key){
        this.key=key;
        right=left=null;
      }
    }

    ArrayToBst(){
      root=null;
    }

    public void push(int key){
      root=pushRec(root,key);
    }

    Node pushRec(Node root,int key){
      if(root==null){
        root=new Node(key);
        return root;
      }
      if(key<root.key){
        root.left=pushRec(root.left,key);
      }else if(key>root.key){
        root.right=pushRec(root.right,key);
      }
      return root;
    }

     void showInOrder(){
       inOrderRec(root);
     }

     void inOrderRec(Node root){
       if(root==null){
         return;
       }
       inOrderRec(root.left);
       System.out.println(root.key);
       inOrderRec(root.right);
     }

     void deleteNode(int key){
       root=deleteNodeRec(root,key);
     }

     Node deleteNodeRec(Node root,int key){
       if(root==null){
         System.out.println("Invalid");
       }
       if(key<root.key){
         root.left=deleteNodeRec(root.left,key);
       }else if(key>root.key){
         root.right=deleteNodeRec(root.right,key);
       }
       else{
         if(root.left==null)
         return root.left;
         else if(root.right==null)
         return root.right;

       root.key=minVal(root.right);
       root.right=deleteNodeRec(root.right,root.key);
     }
     return root;


     }

     public int minVal(Node root){
       int min=root.key;
       while(root.left!=null){
         min=root.left.key;
         root=root.left;
       }
       return min;
     }


  public static void main(String args[]){
    ArrayToBst arraytobst=new ArrayToBst();
    int a[]=new int[]{10,5,1,7,40,50};
    for(int i=0;i<a.length;i++){
      arraytobst.push(a[i]);
    }
    arraytobst.showInOrder();

    System.out.println("Initiating delete");

    arraytobst.deleteNode(1);

    arraytobst.showInOrder();
  }
}
