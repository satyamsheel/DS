//package com.satyam.codeforces.distributer;

import java.util.*;
public class DangerousFootball {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int danger=0;
		int count;
		if(s.charAt(0)=='1')
			count=1;
		else
			count=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='1') {
				if(count==0) {
					count=1;
					danger=0;
				}
				++danger;
				if(danger==7) {
					System.out.println("YES");
					break;
				}
			}else if(s.charAt(i)=='0') {
				if(count==1) {
					danger=0;
					count=0;
				}
				++danger;
				if(danger==7) {
					System.out.println("YES");
					break;
				}
			}
			if(i==s.length()-1) {
				System.out.println("NO");
			}
		}
		
		sc.close();

	}

}
