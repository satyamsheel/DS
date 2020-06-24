package com.satyam.codeforces;

import java.util.*;
public class Elephant {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int dist=sc.nextInt();
		int step;
		step=dist/5;
		if((dist%5)>0)
			step++;
		System.out.println(step);
		
		sc.close();
	}

}
