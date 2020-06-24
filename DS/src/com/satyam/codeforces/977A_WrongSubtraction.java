package com.satyam.codeforces;

import java.util.*;
public class WrongSubtraction {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String word[]=s.split(" ");
		int a=Integer.parseInt(word[0]);
		int b=Integer.parseInt(word[1]);
		
		for(int i=0;i<b;i++) {
			if(a%10==0) {
				a=a/10;
				continue;
			}else {
				a=a-1;
			}
		}
		System.out.println(a);
		
		sc.close();
	}

}
