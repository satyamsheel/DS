package com.satyam.practise;

import java.util.*;
public class BeautifulMatrix_263A {
	static char a[][]=new char[5][5];
	
	public static void doTheMagic(char a[][]) {
		int r=-1,c=-1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(a[i][j]=='1') {
					r=i;
					c=j;
					break;
				}
			}
		}
		int count=Math.abs(r-2)+Math.abs(c-2);
		System.out.println(count);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i] = sc.nextLine().replaceAll(" ", "").toCharArray();
		}
		doTheMagic(a);
		
		
	}

}
