package com.satyam.codeforces.distributer;

import java.util.*;
public class ArrayAndSwap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tt=sc.nextInt();
		
		while(tt-->0) {
		int n=sc.nextInt();
		int swap=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int d=n-1;
		int t=0;
		int temp;
		for(int i=0;i<n;i++) {
			if(t==swap) {
				break;
			}else if(arr1[i]<arr2[d]) {
				temp=arr2[d];
				arr2[d]=arr1[i];
				arr1[i]=temp;
				++t;
				if(t==swap)
					break;
			}
		d--;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr1[i];
		}
		System.out.println(sum);
		}
		sc.close();
	}

}
