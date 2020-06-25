package com.satyam.codeforces;

import java.util.*;
public class Hulk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int help=sc.nextInt();
		for(int i=1;i<=help;i++) {
			if(i == help && (i&1)==1) {
				System.out.print("I hate it ");
			}else if(i==help && (i&1)==0) {
				System.out.print("I love it ");
			}else if((i&1)==1) {
				System.out.print("I hate that ");
			}else if((i&1)==0) {
				System.out.print("I love that ");
			}
			
		}
		
		sc.close();
	}

}
