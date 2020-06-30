package com.satyam.codeforces.distributer;

import java.util.*;
public class MaximumInTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("1");
			return;
		}
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			a[i][0]=1;
			a[0][i]=1;
		}
		int max=0;
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				a[i][j]=a[i-1][j]+a[i][j-1];
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.println(max);
		
		sc.close();

	}

}
