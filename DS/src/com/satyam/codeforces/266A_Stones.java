package com.satyam.codeforces;

import java.util.*;
public class Stones {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s=sc.next();
		int c=0;
		
		for(int i=0;i<a-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
		}
		System.out.println(c);
		sc.close();
	}

}
