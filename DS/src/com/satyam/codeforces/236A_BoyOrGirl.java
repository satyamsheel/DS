package com.satyam.codeforces;

import java.util.*;
public class BoyOrGirl {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=1;
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		for(int i=1;i<ch.length;i++) {
			if(ch[i-1]!=ch[i]) {
				++count;
			}
		}
		if((count&1)==0) {
			System.out.println("CHAT WITH HER!");
		}else
			System.out.println("IGNORE HIM!");

		sc.close();
	}

}
