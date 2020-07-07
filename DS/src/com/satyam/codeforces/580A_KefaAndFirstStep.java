//package com.satyam.codeforces.distributer;

import java.util.*;
public class KefaAndFirstStep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		
		int prev=0;
		int seq=0;
		int saver=1;
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i-1]<=arr[i]) {
				seq++;
				saver=Math.max(seq,saver);
			}else
				seq=1;
		}
		System.out.println(saver);
		sc.close();

	}

}
