package com.satyam.codeforces;

import java.util.Scanner;
public class WordCapatilization {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.substring(0, 1).toUpperCase()+s.substring(1);
		System.out.println(s);
		sc.close();
	}

}
