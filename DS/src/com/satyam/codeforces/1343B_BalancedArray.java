package com.satyam.codeforces.distributer;

import java.util.*;
public class BalancedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->=1) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			int k=0;
			int p=1;
			int sume=0,sumo=0;
			for(int i=0;i<n;i++) {
				if(i<n/2) {
					k=k+2;
					sume=sume+k;
					arr[i]=k;		
				}else if(i>=n/2) {
					if(i<n-1) {
						if(i==n/2) {
							arr[n/2]=p;
							sumo=sumo+p;
						}else {
							p=p+2;
							sumo=sumo+p;
							arr[i]=p;
						}
					}else if(i==n-1) {
						arr[n-1]=sume-sumo;
					}
				}
			}
			
			int sum1=0,sum2=0;
			for(int i=0;i<n;i++) {
				if(i<n/2) {
					sum1=sum1+arr[i];
				}else if(i>=n/2) {
					sum2=sum2+arr[i];
				}
			}
			if(arr[n-1]%2==0) {
				System.out.println("NO");
			}
			else if(sum1==sum2) {
				System.out.println("YES");
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}else
				System.out.println("NO");
			
			
		}
		
		sc.close();

	}

}
