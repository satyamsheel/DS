package com.satyam.Graph;

import java.util.*;
public class MotherVertex {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	MotherVertex(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	public void add(int i,int j) {
		adj[i].add(j);
	}
	
	public void dfsutil(int s,boolean visited[]) {
		visited[s]=true;
		
		Iterator<Integer> i=adj[s].listIterator(); 
		
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n]) {
				dfsutil(n,visited);
			}
		}
	}
	
	public int findMother() {
		boolean visited[]=new boolean[V];
		
		int v=0;
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
			dfsutil(i,visited);
			v=i;
		}
			}
		
		Arrays.fill(visited, false);
		dfsutil(v,visited);
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {
				return -1;
			}
		}
		return v;
	}
	
	public static void main(String[] args) {
		MotherVertex mothervertex =new MotherVertex(7);
		mothervertex.add(0,1);
		mothervertex.add(0,2);
		mothervertex.add(1,3);
		mothervertex.add(4,1);
		mothervertex.add(6,4);
		mothervertex.add(5,6);
		mothervertex.add(5,2);
		mothervertex.add(6,0);
		
		int t=mothervertex.findMother();
		System.out.println(t);
	}

}
