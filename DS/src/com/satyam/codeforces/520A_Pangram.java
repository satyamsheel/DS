package com.satyam.codeforces;

import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		String s=sc.next();
		s=s.toLowerCase();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		
		int count=0;
		for(int i=0;i<len-1;i++) {
			if(ch[i]!=ch[i+1]) {
				++count;
			}
		}	
		if(ch[len-1]=='z')
			++count; 
		if(count==26 || count==27) {
			System.out.println("YES");
		}else
			System.out.println("NO");
		sc.close();
		

	}

}
