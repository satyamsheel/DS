package com.satyam.codeforces;

import java.util.*;
public class Divisibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while((t--)>=1) {
			int a,b;
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a%b==0?0:b-(a%b));
			}
		sc.close();

	}

}
