package com.satyam.codeforces.distributer;

import java.util.*;

public class ShortSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res = "";
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			res = res + s.charAt(0);
			for (int i = 1; i < s.length(); i += 2) {
				res = res + s.charAt(i);
			}
			System.out.println(res);
			res="";
		}
		
		sc.close();

	}

}
