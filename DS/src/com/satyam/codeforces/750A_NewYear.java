package com.satyam.codeforces.distributer;

import java.util.*;
public class NewYear {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int time=(240-b);
		int t=0;
		int k=0;
		for(int i=1;i>-1;i++) {
			t=t+5*i;
			if(t<=time) {
				++k;
				if(k==a)
					break;
				}
			else
				break;
		}
		System.out.println(k);
		
		sc.close();
	}

}
