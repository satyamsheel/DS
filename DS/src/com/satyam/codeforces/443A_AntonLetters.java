package com.satyam.codeforces;

import java.util.*;
public class AntonLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.substring(1, s.length()-1);
		String arr[]=s.split(" ");
		String f="";
		for(int i=0;i<arr.length;i++) {
			f=f+arr[i];
		}
		arr=f.split(",");
		f="";
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			f=f+arr[i];
		}
		int count=1;
		for(int i=0;i<f.length()-1;i++) {
			if(f.charAt(i)!=f.charAt(i+1)) {
				count++;
			}
		}
		if(f.length()==0) {
			count=0;
		}
		System.out.println(count);
		
		
		sc.close();

	}

}
