package com.satyam.codeforces.distributer;

import java.util.*;
public class MinimalSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a>b) {
				a = a^b;
				b = b^a;
				a = a^b;
			}
			System.out.println(Math.max(a*2, b)*Math.max(a*2, b));
		}
		
		sc.close();

	}

}
