package com.satyam.codeforces;

import java.util.*;
public class Magnets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int mag[]=new int[num];
		for(int i=0;i<num;i++) {
			mag[i]=sc.nextInt();
		}
		int t=0;
		for(int i=0;i<num-1;i++) {
			if(mag[i]!=mag[i+1]) {
				++t;
			}
		}
		System.out.println(t+1);
		sc.close();
	}

}
