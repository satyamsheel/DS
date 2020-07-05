package com.satyam.codeforces.distributer;

import java.util.*;
public class HonestCoach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int num=sc.nextInt();
			int arr[]=new int[num];
			for(int i=0;i<num;i++) {
				arr[i]=sc.nextInt();
			}
		
			Arrays.sort(arr);
			int res=arr[num-1]-arr[0];
			for(int i=0;i<num;i++) {
				for(int j=i+1;j<num;j++) {
					res=Math.min(res, arr[j]-arr[i]);
				}
			}
			System.out.println(res);
		}
		
		sc.close();

	}

}
