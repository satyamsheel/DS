package com.satyam.codeforces;

import java.util.*;
public class LuckyOrUncucky {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		
		int count=0;
		for(int i=0;i<num.length();i++) {
			if(num.charAt(i) == '4' || num.charAt(i) == '7') {
				++count;
			}
		}
		if(count == 4 || count == 7)
			System.out.println("YES");
		else
			System.out.println("NO");
			
		
		sc.close();

	}

}
