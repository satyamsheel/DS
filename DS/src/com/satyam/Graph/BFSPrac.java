package com.satyam.Graph;

import java.util.*;
public class BFSPrac {
	
	private int V;
	private LinkedList<Integer> adj[];

	BFSPrac(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	public void add(int i,int j) {
		adj[i].add(j);
	}
	
	public void BFS(int s) {
		boolean visited[]=new boolean[V];
		LinkedList<Integer> queue=new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		
		while(!queue.isEmpty()) {
			
			s=queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> i=adj[s].listIterator();
			while(i.hasNext()) {
				int p=i.next();
				if(!visited[p]) {
					queue.add(p);
					visited[p]=true;
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		BFSPrac bfsprac=new BFSPrac(4);
		
		bfsprac.add(0,1);
		bfsprac.add(0,2);
		bfsprac.add(1,2);
		bfsprac.add(2,0);
		bfsprac.add(2,3);
		bfsprac.add(3,3);
		
		bfsprac.BFS(0);

	}

}
