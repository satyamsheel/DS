package com.satyam.Graph;

import java.util.*;
public class DFS {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	DFS(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++) {
			adj[i]=new LinkedList<>();
		}
	}
	public void add(int i,int j) {
		adj[i].add(j);
	}
	
	public void Depth(int s) {
		boolean visited[]=new boolean[V];
		
		DFSutil(s,visited);
	}
	
	public void DFSutil(int s,boolean visited[]) {
		visited[s]=true;
		System.out.print(s+" ");
		
		Iterator<Integer> i=adj[s].listIterator();
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n]) {
				DFSutil(n,visited);
			}
		}
	}
	

	public static void main(String[] args) {
		DFS dfs =new DFS(4);
		
		dfs.add(0,1);
		dfs.add(0,2);
		dfs.add(1,2);
		dfs.add(2,0);
		dfs.add(2,3);
		dfs.add(3,3);
		
		dfs.Depth(2);

	}

}
