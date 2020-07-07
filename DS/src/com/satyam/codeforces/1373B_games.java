//package com.satyam.codeforces.distributer;

import java.util.*;
public class games {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String n=sc.next();
			int O=0,ONE=0;
			for(int i=0;i<n.length();i++) {
				if(n.charAt(i)=='0') {
					++O;
				}else {
					++ONE;
				}
			}
			int k=Math.min(O, ONE);
			if(k%2==1) {
				System.out.println("DA");
			}else {
				System.out.println("NET");
			}
		}
		sc.close();

	}

}
