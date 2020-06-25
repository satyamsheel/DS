package com.satyam.codeforces;

import java.util.*;
public class Function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long func=sc.nextLong();
		long value=0;
			if((func&1)==0) {
				value=func/2;
			}else {
				value=-(func+1)/2;
			}
		System.out.println(value);
		sc.close();
	}

}
