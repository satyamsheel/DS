package com.satyam.codeforces.distributer;

import java.util.*;
public class UnsatableArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int sum=sc.nextInt();
			if(n==1) {
				System.out.println("0");
			}else if(n==2) {
				System.out.println(sum);
			}else
				System.out.println(sum*2);
		}
		
		sc.close();

	}

}
