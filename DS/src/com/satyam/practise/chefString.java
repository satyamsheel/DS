package com.satyam.codeforces.distributer;

import java.util.*;
public class chefString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-->0) {
			long num=sc.nextLong();
			long sum=0;
			long arr[]=new long[(int) num];
			for(long i=0;i<num;i++) {
				arr[(int) i]=sc.nextLong();
			}
			for(long i=1;i<num;i++) {
				sum=sum+(Math.abs(arr[(int) (i-1)]-arr[(int) i])-1);
			}
			System.out.println(sum);
		}
		
		sc.close();

	}

}
