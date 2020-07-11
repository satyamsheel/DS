package com.satyam.codeforces.distributer;

import java.util.*;
public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int a1=sc.nextInt();
			int b1=sc.nextInt();
			
			if(Math.max(a, b)==Math.max(a1, b1) && Math.min(a, b)+Math.min(a1, b1)==Math.max(a1, b1)) {
				System.out.println("YES");
			}else
				System.out.println("NO");
		}
		sc.close();

	}

}
