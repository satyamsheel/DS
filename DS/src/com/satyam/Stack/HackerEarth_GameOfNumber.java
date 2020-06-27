package com.satyam.Stack;

import java.util.*;
public class HackerEarth_GameOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int t=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				t=j;
				if(arr[i]<arr[j]) {
					arr2[i]=arr[j];
					break;
				}else if(t==n-1) {
					arr2[i]=-1;
					t=0;
					break;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			t=arr2[i];
			int p=-1;
			if(t==-1) {
				System.out.print("-1"+" ");
				continue;
			}
			for(int j=i;j<n;j++) {
				if(arr[j]==t) {
					p=j;
					break;
				}
			}
			for(int k=p+1;k<n;k++) {
				if(arr[k]<t) {
					System.out.print(arr[k]+" ");
					break;
				}
			}
		}
		sc.close();

	}

}
