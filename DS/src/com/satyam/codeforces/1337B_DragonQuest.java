package com.satyam.codeforces.distributer;

import java.util.*;
public class DragonQuest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			while(a>0) {
				if(c*10>=a) {
					a=a-(c*10);
					break;
				}
				if(b>0) {
					a=Math.floorDiv(a, 2)+10;
					b--;
				}
				else if(c>0) {
					a=a-10;
					c--;
				}
				if(b==0  && c==0)
					break;
			}
			if(a>0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			
			
		}

	}

}
