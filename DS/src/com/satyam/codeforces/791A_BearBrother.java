package com.satyam.codeforces;

import java.util.*;
public class BearBrother {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String word[]=s.split(" ");
		int a=Integer.parseInt(word[0]);
		int b=Integer.parseInt(word[1]);
		int wa=a,wb=b;
		for(int i=1;i>-1;i++) {
			wa=wa*3;
			wb=wb*2;
			if(wa>wb) {
				System.out.println(i);
				break;
			}
			
		}
		sc.close();
		
	}

}
