package com.satyam.Graph;

import java.util.*;
public class DFSPrac {
	private int V;
	private LinkedList<Integer> adj[];
	
	DFSPrac(int v){
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
		
		DepthUtil(s,visited);
	}
	
	public void DepthUtil(int s,boolean visited[]) {
		visited[s]=true;
		System.out.println(s);
		
		Iterator<Integer> i=adj[s].listIterator();
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n]) {
				DepthUtil(n,visited);
			}
		}
	}
	
	public static void main(String[] args) {
		DFSPrac dfsprac=new DFSPrac(4);
		
		dfsprac.add(0,1);
		dfsprac.add(0,2);
		dfsprac.add(1,2);
		dfsprac.add(2,0);
		dfsprac.add(2,3);
		dfsprac.add(3,3);
		
		dfsprac.Depth(2);

	}

}
