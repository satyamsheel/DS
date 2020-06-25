package com.satyam.codeforces;

import java.util.*;
public class Guy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		int maxX=sc.nextInt();
		int arr[]=new int[maxX+1];
		for(int i=1;i<=maxX;i++) {
			arr[i]=sc.nextInt();
		}
		int maxY=sc.nextInt();
		int arr2[]=new int[maxY+1];
		for(int i=1;i<=maxY;i++) {
			arr2[i]=sc.nextInt();
		}
		int res[]=new int[max+1];
		
		for(int i=1;i<=max;i++) {
			res[i]=-1;
		}
		for(int i=1;i<=maxX;i++) {
			int val1=arr[i];
			res[val1]=val1;
		}
		for(int i=1;i<=maxY;i++) {
			int val2=arr2[i];
			res[val2]=val2;
		}
		int count=0;
		for(int i=1;i<=max;i++) {
			if(res[i]!=-1) {
				++count;
			}
		}
		if(count==max) {
			System.out.println("I become the guy.");
		}else
			System.out.println("Oh, my keyboard!");
		sc.close();
	}

}
