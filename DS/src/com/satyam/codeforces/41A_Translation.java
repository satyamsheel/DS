package com.satyam.codeforces;

import java.util.*;
public class Translation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ss=sc.next();
		
		StringBuilder word=new StringBuilder();
		word.append(ss);
		word=word.reverse();
		
		if(s.equalsIgnoreCase(word.toString())) {
			System.out.println("YES");
		}else
			System.out.println("NO");
		sc.close();
	}

}
