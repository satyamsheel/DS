package satyamPractise;

import java.util.*;
public class codevita {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c[] = new int[num];
		String cc[] = new String[num];
		for (int initial = 0; initial < num; initial++) {
			c[initial] = sc.nextInt();}
		if(num==1) {
			int zz=0;
			int O=0;
			String str1 = Integer.toBinaryString(c[0]);
			for(int initial=0;initial<str1.length();initial++) {
				if(str1.charAt(initial)=='0') 
					zz++;
				else O++;
			}
				if(O==zz) {
					String str2=Integer.toBinaryString(O);
					if(str2.length()==str1.length()) 
						System.out.print(str2);
					else {
						String str="";
						int di=Math.abs(str1.length()-str2.length());
						for(int j=0;j<di;j++)
							str+="0";
						str+=str2;
						System.out.print(str);	}
				}else {
					String str="";
					for(int j=0;j<str1.length();j++) 
						str+="0";
					System.out.print(str);}
			return;
		}
		int lengthVal = 0;
		for (int initial = 0; initial < num; initial++) {
			String str1 = Integer.toBinaryString(c[initial]);
			cc[initial] = str1;
			int length = str1.length();
			if (length > lengthVal) {
				lengthVal = length;		}}
		for (int initial = 0; initial < num; initial++) {
			String str1 = cc[initial];
			if (str1.length() < lengthVal) {
				int remainder = lengthVal - str1.length();
				String sFinal = "";
				for (int j = 0; j < remainder; j++) {
					sFinal = sFinal + "0";}
				sFinal += str1;
				cc[initial] = sFinal;}}
		int arr2[][] = new int[1000][2];
		int z = 0;
		int O = 0;
		for (int initial = 0; initial < num; initial++) {
			String str1 = cc[initial];
			for (int j = 0; j < str1.length(); j++) {
				if (str1.charAt(initial) == '0') 
					z++;
				 else {
					O++;	}}
			arr2[c[initial]][0] = z;
			arr2[c[initial]][1] = O;
			O = 0;
			z = 0;}
		int len = c.length;
		String arr3[]=new String[1<<len];
		String str2="";
		for (int initial = 0; initial < (1<<len); initial++) 
		{ 
			for (int j = 0; j < len; j++) 
				if ((initial & (1 << j)) > 0) 
					str2+=c[j] + " "; 
			arr3[initial]=str2;
			str2="";}	
		int zeros1=0;
		int ones1=0;
		int fA=0;
		for(int initial=1;initial<(1<<len)-1;initial++) {
			String arr4[]=arr3[initial].split(" ");
			for(String w:arr4) {
				int a=Integer.parseInt(w);
				zeros1+=arr2[a][0];
				ones1+=arr2[a][1];}
			if(zeros1==ones1) 
				++fA;
			zeros1=0;
			ones1=0;}
		String sfinal = Integer.toBinaryString(fA+1);
		if(sfinal.length()==lengthVal) {
			System.out.print(sfinal);
		}else {
			String str="";
			int di=Math.abs(lengthVal-sfinal.length());
			for(int initial=0;initial<di;initial++) 
				str+="0";
			str+=sfinal;
			System.out.print(str);
		}		
	}
}
