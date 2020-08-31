package com.satyam.codeforces.distributer;

import java.util.*;
public class maximus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int ans[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			int sum1=arr[i]+sum;
			System.out.print(sum1+" ");
			sum=Math.max(sum, sum1);
		}
		sc.close();
	}

}
