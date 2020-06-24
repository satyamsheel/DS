package com.satyam.codeforces;

import java.util.*;
public class UpperCaseOrLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int upper=0,lower=0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				++upper;
			}else
				++lower;
		}
		
		if(upper == lower) {
			System.out.println(s.toLowerCase());
		}else if(upper>lower) {
			System.out.println(s.toUpperCase());
		}else
			System.out.println(s.toLowerCase());
		sc.close();
	}

}
