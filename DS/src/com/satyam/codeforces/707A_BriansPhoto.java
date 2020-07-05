//package com.satyam.codeforces.distributer;

import java.util.*;
public class BriansPhoto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char arr[][]=new char[n][m];
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				String p=sc.next();
				arr[i][j]=p.charAt(0);
				
				if(arr[i][j]=='C' ||arr[i][j]=='M' || arr[i][j]=='Y') {
					System.out.println("#Color");
					flag=1;
					break;
				}
				if(i==n-1 && j==m-1) {
					System.out.println("#Black&White");
				}
			}
			if(flag==1)
				break;
		}
		sc.close();

	}

}
