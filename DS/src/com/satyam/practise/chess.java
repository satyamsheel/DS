package com.satyam.codeforces.distributer;

import java.util.*;
public class chess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int num=sc.nextInt();
			System.out.print("O");
			int row=7;
			int remaining=num-1;
			int i=0;
			while(i<remaining) {
				System.out.print(".");
				i++;
				row--;
				if(row==0) {
					System.out.println();
					row=8;
				}
			}
			remaining=64-num;
			i=0;
			while(i<remaining) {
				System.out.print("X");
				i++;
				row--;
				if(row==0) {
					System.out.println();
					row=8;
				}
			}
			System.out.println();
		}
		
		sc.close();

	}

}
