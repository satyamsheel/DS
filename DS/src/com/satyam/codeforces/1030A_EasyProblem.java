package com.satyam.codeforces;

import java.util.*;
public class EasyProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int response[]=new int[num];
		
		for(int i=0;i<num;i++) {
			response[i]=sc.nextInt();
			if(response[i]==1) {
				System.out.println("HARD");
				break;
			}else if(i==num-1) {
				System.out.println("EASY");

			}
		}
		
		sc.close();
	}

}
