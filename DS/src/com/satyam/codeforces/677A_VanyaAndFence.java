package com.satyam.codeforces;

import java.util.*;
public class VanyaAndFence {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int height=sc.nextInt();
		
		int indiHeight[]=new int[num];
		int width=0;
		
		for(int i=0;i<num;i++) {
			indiHeight[i]=sc.nextInt();
			if(indiHeight[i]<=height) {
				++width;
			}else {
				width=width+2;
			}
		}
		
		System.out.println(width);
		sc.close();

	}

}
