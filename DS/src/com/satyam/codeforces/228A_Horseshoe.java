package com.satyam.codeforces;

import java.util.*;
public class Horseshoe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int count=1;
		if(a!=b && a!=c && a!=d) {
			count++;
		}
		if(b!=c && b!=d) {
			count++;
		}
		if(c!=d) {
			count++;
		}
		System.out.println(4-count);
		sc.close();

	}

}
