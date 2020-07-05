package com.satyam.codeforces.distributer;

import java.util.*;
public class ParkLightning {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			double a=sc.nextInt();
			double b=sc.nextInt();
			int p=(int) Math.ceil((a*b)/2);
			System.out.println(p);
		}
		sc.close();

	}

}
