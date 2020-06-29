package com.satyam.codeforces.distributer;

import java.util.*;
public class PhoenixBalance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(--n>=0) {
			int nn=sc.nextInt();
			int ans=(1<<nn);
			for(int i=1;i<=nn-1;i++) {
				if(i<nn/2)
					ans+=(1<<i);
				else
					ans-=(1<<i);
			}
			System.out.println(ans);
		}
		
		
		
		sc.close();

	}

}
