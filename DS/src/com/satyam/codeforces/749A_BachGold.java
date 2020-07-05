package com.satyam.codeforces.distributer;

import java.util.*;
public class BachGold {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n&1)==0) {
			int p=n/2;
			System.out.println(p);
			for(int i=0;i<p;i++) {
				System.out.print("2"+" ");
			}
		}else {
			int p=n-3;
			int p1=p/2;
			System.out.println(p1+1);
			for(int i=0;i<p1;i++) {
				System.out.print("2"+" ");
			}
			System.out.print("3");
		}
		sc.close();

	}

}
