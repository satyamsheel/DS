package com.satyam.codeforces.distributer;

import java.util.*;
public class Shovel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=1;i>-1;i++) {
			if((a*i%10)==0){
				System.out.println(i);
				break;
			}else if((((a*i))-b)%10==0) {
				System.out.println(i);
				break;
			}
		}
		sc.close();

	}

}
