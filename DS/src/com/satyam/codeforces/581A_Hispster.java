package com.satyam.codeforces.distributer;

import java.util.*;
public class Hispster {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a<b?a:b;
		int d=(a+b)-c;
		System.out.println(c+" "+((d-c)/2));
		
		
		sc.close();

	}

}
