package com.satyam.codeforces.distributer;

import java.util.*;
public class RestoringNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.print(a[3]-a[0]+" ");
		System.out.print(a[3]-a[1]+" ");
		System.out.print(a[3]-a[2]+" ");
		sc.close();

	}

}
