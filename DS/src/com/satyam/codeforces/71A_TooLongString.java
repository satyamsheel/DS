package com.satyam.codeforces;

import java.util.*;
public class TooLongString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> arr=new ArrayList<String>();
		if(n>=1 && n<=100) {
		for(int i=0;i<n;i++) {
			arr.add(sc.next());
		}
		for(String s:arr) {
			if(s.length()<=10) {
				System.out.println(s);
			}else if(s.length()>10) {
				char ch=s.charAt(0);
				int len=s.length()-2;
				char lst=s.charAt(s.length()-1);
				System.out.print(ch);
				System.out.print(len);
				System.out.println(lst);
			}
		}
		}
		
		sc.close();
	}

}
