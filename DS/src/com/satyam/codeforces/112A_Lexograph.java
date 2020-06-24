package com.satyam.codeforces;

import java.util.*;
public class Lexograph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ss=sc.next();
		 
			int t=s.compareToIgnoreCase(ss);
			if(t==0){
				System.out.println("0");
			}else if(t<0) {
				System.out.println("-1");
			}else if(t>0) {
				System.out.println("1");
			}
			sc.close();
	}
}
