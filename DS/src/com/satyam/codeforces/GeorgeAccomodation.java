package com.satyam.codeforces;

import java.util.*;
public class GeorgeAccomodation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			int a=sc.nextInt();
			int b=sc.nextInt();
			if((b-a)>=2)
				++count;
		}
		System.out.println(count);
		sc.close();
	}
}
