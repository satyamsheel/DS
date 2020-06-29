package com.satyam.codeforces.distributer;

import java.util.*;
public class ICPCTeam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int freq=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int oportunity=0;
		int team=0;
		for(int i=0;i<n;i++) {
			if((arr[i]+freq)>5) {
				continue;
			}else {
				++oportunity;
				if(oportunity==3) {
					++team;
					oportunity=0;
				}
			}
		}
		System.out.println(team);
		
		sc.close();

	}

}
