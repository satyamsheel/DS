package com.satyam.codeforces.distributer;

import java.util.*;
public class FAFACompany {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int team=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				++team;
		}
		System.out.println(team);
		
		sc.close();

	}

}
