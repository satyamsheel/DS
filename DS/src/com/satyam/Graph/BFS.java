package com.satyam.Graph;


import java.util.*;
class BFS{
    private int V;
    private LinkedList<Integer> adj[];

    BFS(int v){
      V=v;
      adj=new LinkedList[V];
      for(int i=0;i<V;++i){
        adj[i]=new LinkedList<Integer>();
      }
    }

    public void addEdge(int i,int j){
      adj[i].add(j);
    }
    public void Breadth(int s){
      boolean visited[]=new boolean[V];

      LinkedList<Integer> queue = new LinkedList<Integer>();

      visited[s]=true;
      queue.add(s);

      while(queue.size() !=0){

        int n=queue.poll();
        System.out.println(n+" ");
        Iterator<Integer> i= adj[s].listIterator();

        while(i.hasNext()){
          int k=i.next();
          if(!visited[k]){
            visited[k]=true;
            queue.add(k);
          }
        }
      }

    }

  public static void main(String args[]){
    BFS bfs=new BFS(4);
    
     bfs.addEdge(0, 1);
     bfs.addEdge(0, 2);
     bfs.addEdge(1, 2);
     bfs.addEdge(2, 0);
     bfs.addEdge(2, 3);
     bfs.addEdge(3, 3);

     bfs.Breadth(2);

  }
}
