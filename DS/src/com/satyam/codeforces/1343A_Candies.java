package com.satyam.codeforces.distributer;

import java.util.*;
public class Candies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int ans=0;
			for(int k=2;k<=35;k++) {
				int val=(int) (Math.pow(2, k)-1); 
				if(n % val==1)
					continue;
				ans=n/val;
				break;
			}
			System.out.println(ans);
		}
		
		sc.close();

	}

}
