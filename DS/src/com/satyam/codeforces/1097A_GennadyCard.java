package com.satyam.codeforces.distributer;

import java.util.*;
public class GennadyCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String table=sc.next();
		String arr[]=new String[5];
		
		for(int i=0;i<5;i++) {
			
			
			arr[i]=sc.next();
			
			char ch=arr[i].charAt(0);
			char ch1=arr[i].charAt(1);
			
			char ch2=table.charAt(0);
			char ch3=table.charAt(1);
			
			if(ch==ch2 || ch1==ch3) {
				System.out.println("YES");
				break;
			}
			if(i==4) {
				System.out.println("NO");
				}
		}
		
		
		
		sc.close();

	}

}
