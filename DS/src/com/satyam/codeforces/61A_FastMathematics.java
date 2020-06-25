package com.satyam.codeforces;

import java.util.*;
public class FastMathematics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ss=sc.next();
		String result="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=ss.charAt(i)) {
				result=result.concat("1");
			}else
				result=result.concat("0");
		}
		System.out.println(result);
		
		sc.close();
	}

}
