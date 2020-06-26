package com.satyam.codeforces;

import java.util.*;
public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				if((i&1)==1) {
					System.out.print("#");
				}else {
					if(d==0 && j!=b) {
						System.out.print(".");
					}
					if(d==0 && j==b) {
						System.out.print("#");
						d=1;
						continue;
					}
					if(d==1 && j==1) {
						System.out.print("#");
					}
					if(d==1 && j!=1) {
						System.out.print(".");
						if(j==b) {
							d=0;
							continue;
							}
					}
				}
			}
			System.out.println();
		}
				
		sc.close();
	}

}
