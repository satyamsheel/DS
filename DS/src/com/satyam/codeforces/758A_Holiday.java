package com.satyam.codeforces.distributer;

import java.util.*;
public class Holiday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int d=arr[n-1];
		int cost=0;
		for(int i=0;i<n;i++) {
			cost=cost+(d-arr[i]);
		}
		System.out.println(cost);
		
		sc.close();

	}

}
