package com.satyam.codeforces.distributer;

import java.util.*;

public class OrcAndFactrors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int val = 0;
			if (a%2==0) {
				val=a+(2*b);
			} else {
				for (int i = 3; i <=a; i++) {
					if (a % i == 0) {
						a = a+i;
						b--;
						break;
					} 
				}
				val=a+(2*b);
			}
			
			System.out.println(val);
		}
		sc.close();

	}

}
