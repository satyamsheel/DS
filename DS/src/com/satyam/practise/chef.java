package com.satyam.codeforces.distributer;

import java.util.*;
public class chef {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int round=sc.nextInt();
			int chef=0;
			int morty=0;
			for(int i=0;i<round;i++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a<10 && b<10) {
					if(a>b) {
						++chef;
					}else if(b>a) {
						++morty;
					}else {
						++chef;
						++morty;
					}
				}else {
					int sum=0,sum1=0;
					if(a>9) {
						while(a!=0) {
							sum=sum+a%10;
							a=a/10;
						}
					}else
						sum=a;
					if(b>9) {
						while(b!=0) {
							sum1=sum1+b%10;
							b=b/10;
						}
					}else
						sum1=b;
					
					if(sum>sum1) {
						++chef;
					}else if(sum1>sum) {
						++morty;
					}else {
						++chef;
						++morty;
					}
					
					
				}
			}
			if(chef>morty) {
				System.out.println("0 "+ chef);
			}else if(morty>chef) {
				System.out.println("1 "+ morty );
			}else {
				System.out.println("2 "+ chef);
			}
		}
		sc.close();

	}

}
