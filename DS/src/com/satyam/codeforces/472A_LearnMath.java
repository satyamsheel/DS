package com.satyam.codeforces;

import java.util.*;
public class LearnMath {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a-4+" "+"4");
		}else {
			System.out.println(a-9+" "+"9");
		}
		sc.close();
	}

}
