package com.satyam.Graph;

import java.util.*;
public class AdjencyList {
	
	static void graphAdd(ArrayList<ArrayList<Integer>> arr,int i,int j) {
		arr.get(i).add(j);
		arr.get(j).add(i);
	}
	
	static void graphShow(ArrayList<ArrayList<Integer>> arr) {
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.get(i).size();j++) {
				System.out.print(arr.get(i).get(j));
			}
			System.out.println();
		}
		
	}
	
	

	public static void main(String[] args) {
		int v=5;
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		graphAdd(arr,0,1);
		graphAdd(arr,0,4);
		graphAdd(arr,1,2);
		graphAdd(arr,1,3);
		graphAdd(arr,1,4);
		graphAdd(arr,2,3);
		graphAdd(arr,3,4);
		
		graphShow(arr);

	}

}
