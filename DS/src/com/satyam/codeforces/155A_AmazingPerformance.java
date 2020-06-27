package com.satyam.codeforces.distributer;

import java.util.*;
public class AmazingPerformance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int low=0,high=0,amazing=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(i==0) {
				low=arr[i];
				high=arr[i];
				continue;
			}
			if(arr[i]<low) {
				++amazing;
				low=arr[i];
				}
			else if(arr[i]>high) {
				++amazing;
				high=arr[i];
				}
		}
		//1 0 1 1 1 1 0 1 1 0 1 1 1 1 0 0 0 1 0 0 1 1 1 0 1 0 0 1 1 0 0 0 0 1 0 0 0 1 1 0 0 0 1 0 0 0 1 1 1 1 0 0 1 0 1 0 0 1 1 0 0 0 0 0 1 0 0 0 0 1 0 0 1 1 1 1 1 1 0 1 0 0 1 1 1 1 0 0 1 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 1 0 0 1 0 0 0 0 0 1 0 1 0 1 0 0 0 0 1 1 1 0 0 1 1 0 1 0 1 1 0 1 1 0 1 1 0 0 1 1 0 0 1 0 1 1 0 1 0 1 0 1 0 1 0 0 1 0 0 1 1 0 1 0 0 0 1 1 1 0 0 0 0 1 1 0 1 0 1 0 0 0 1 0 1 0 1 1 1 1 0 1 1 0 1 1 0 0 0 0 1 0 0 1 1 1 1 0 0 1 0 0 0 1 1 1 1 0 0 1 1 0 1 1 0 0 0 1 0 1 0 1 1 1 0 1 0 0 1 0 1 0 1 0 0 1 0 0 1
		System.out.println(amazing);
		
		sc.close();

	}

}
