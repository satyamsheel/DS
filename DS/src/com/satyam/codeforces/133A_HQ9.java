//package com.satyam.codeforces.distributer;

import java.util.*;
public class HQ9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='H' || ch=='Q' || ch=='9') {
				System.out.println("YES");
				break;
			}
			if(i==s.length()-1) {
				System.out.print("NO");
			}
		}
		
		sc.close();

	}

}
