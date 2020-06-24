package com.satyam.codeforces;

import java.util.*;
public class NextRound {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		String words[]=new String[2];
		words=s.split(" ");
		int i=Integer.parseInt(words[0]);
		int j=Integer.parseInt(words[1]);
		if(i>=1 && i<=100 && j>=1 && j<=100) {
			String ss=sc.nextLine();
			String word[]=new String[i];
			word=ss.split(" ");
			for(String k:word) {
				arr.add(Integer.parseInt(k));
			}
			int count=0;
			for(int p:arr) {
				if(p>=arr.get(j-1) && p>0) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
