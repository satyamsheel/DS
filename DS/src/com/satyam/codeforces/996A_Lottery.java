package com.satyam.codeforces;

import java.util.*;
public class Lottery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ans=0;
		if(a>=100) {
			ans=ans+a/100;
			a=a-((a/100)*100);
		}
		if(a>=20) {
			ans=ans+a/20;
			a=a-((a/20)*20);
		}
		
		if(a>=10) {
			ans=ans+a/10;
			a=a-((a/10)*10);
		}
		if(a>=5) {
			ans=ans+a/5;
			a=a-((a/5)*5);
		}
		ans+=a;
		System.out.println(ans);
		
		sc.close();

	}

}
