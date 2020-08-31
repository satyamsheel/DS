package satyamPractise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		String binary[] = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int lengthVal = 0;
		for (int i = 0; i < n; i++) {
			String s = Integer.toBinaryString(arr[i]);
			binary[i] = s;
			int length = s.length();
			if (length > lengthVal) {
				lengthVal = length;
			}
		}
		for (int i = 0; i < n; i++) {
			String s = binary[i];
			if (s.length() < lengthVal) {
				int remainder = lengthVal - s.length();
				String sFinal = "";
				for (int j = 0; j < remainder; j++) {
					sFinal = sFinal + "0";
				}
				sFinal += s;
				binary[i] = sFinal;
			}
		}
	
		

		int arr2[][] = new int[100][2];
		int zeros = 0;
		int ones = 0;
		for (int i = 0; i < n; i++) {
			String s = binary[i];
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == '0') {
					zeros++;
				} else {
					ones++;
				}
			}
			arr2[arr[i]][0] = zeros;
			arr2[arr[i]][1] = ones;
			ones = 0;
			zeros = 0;
		}
		
		int len = arr.length;
		String arr3[]=new String[1<<len];
		String ss="";
		for (int i = 0; i < (1<<len); i++) 
		{ 
			for (int j = 0; j < len; j++) 
				if ((i & (1 << j)) > 0) 
					ss+=arr[j] + " "; 
			arr3[i]=ss;
			ss="";
		}
		
		int zeros1=0;
		int ones1=0;
		int finalAnswer=0;
		for(int i=1;i<(1<<len)-1;i++) {
			String arr4[]=arr3[i].split(" ");
			for(String w:arr4) {
				int a=Integer.parseInt(w);
				zeros1+=arr2[a][0];
				ones1+=arr2[a][1];
			}
			if(zeros1==ones1) {
				++finalAnswer;
			}
			zeros1=0;
			ones1=0;
		}
		
		String sfinal = Integer.toBinaryString(finalAnswer+1);
		if(sfinal.length()==lengthVal) {
			System.out.println(sfinal);
		}else {
			String sss="";
			int diff=Math.abs(lengthVal-sfinal.length());
			for(int i=0;i<diff;i++) {
				sss+=sss+"0";
			}
			sss+=sfinal;
			System.out.println(sss);
		}	
		sc.close();
	}
}
