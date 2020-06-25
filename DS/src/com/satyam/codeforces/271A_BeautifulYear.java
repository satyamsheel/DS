package com.satyam.codeforces;

import java.util.*;
public class BeautifulYear{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		for(int i=0;i>-1;i++) {
			++year;
		int a=year/1000;
		int b=(year/100)%10;
		int c=(year/10)%10;
		int d=year%10;
		if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
			break;
		}
		}
		System.out.println(year);
		sc.close();
	}
}