package com.satyam.codeforces;

import java.util.*;
public class Presents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]=new int[num+1];
		int b[]=new int[num+1];
		for(int i=1;i<=num;i++) {
			a[i]=sc.nextInt();
		}

		for(int j=1;j<=num;j++) {
			int d=a[j];
			b[d]=j;
		}
		for(int j=1;j<=num;j++) {
		System.out.print(b[j]+" ");
		}
		
		
		
		sc.close();
	}

}
