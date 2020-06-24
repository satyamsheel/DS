package com.satyam.codeforces;

import java.util.*;
public class SolderAndBanana {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] word=s.split(" ");
		
		int a,b,c,cost=0;
		a=Integer.parseInt(word[0]);//k
		b=Integer.parseInt(word[1]);//n
		c=Integer.parseInt(word[2]);//w
		for(int i=1;i<=c;i++) {
			cost=cost+a*i;
		}
		if(cost<=b) {
			System.out.println("0");
		}else {
			System.out.println(cost-b);
		}
		
		sc.close();
	}

}
