package com.satyam.codeforces.distributer;

import java.util.*;
public class Mishka {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int misha=0,chris=0;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a>b) {
				++misha;
			}else if(a<b) {
				++chris;
			}else
				continue;
		}
		String res="";
		if(misha>chris) {
			res="Mishka";
		}else if(chris>misha) {
			res="Chris";
		}else
			res="Friendship is magic!^^";
		
		System.out.println(res);
		sc.close();

	}
}
