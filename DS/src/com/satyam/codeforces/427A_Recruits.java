package com.satyam.codeforces.distributer;

import java.util.*;
public class Recruits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int recruit=0;
		int crime=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>-1) {
				recruit=recruit+arr[i];
			}else if(arr[i]==-1) {
				++crime;
				if(recruit>0) {
					--crime;
					--recruit;
				}
				
			}
		}
		System.out.println(crime);
		sc.close();

	}

}
