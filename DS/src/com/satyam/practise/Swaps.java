package com.satyam.codeforces.distributer;

import java.util.*;
public class Swaps {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int val=sc.nextInt();
			int arr1[]=new int[val];
			int arr2[]=new int[val];
			for(int i=0;i<val;i++) {
				arr1[i]=sc.nextInt();
			}
			int j=0;
			while(j<val) {
				arr2[j]=sc.nextInt();
				j++;
			}
			Arrays.sort(arr2);
			Arrays.sort(arr1);
			if(arr1.length==1) {
				if(!Arrays.equals(arr1, arr2)) {
					System.out.println("-1");
				}
			}
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("0");
			}else {
				int cost=0;
				for(int i=0;i<val;i++) {
					if(arr1[i]==arr2[i]) {
						continue;
					}else {
						int index=Arrays.binarySearch(arr2, arr2[i]);
						if(index==-1) {
							System.out.println("-1");
						}else {
							int temp;
							temp=arr2[index];
							arr2[index]=arr1[i];
							arr1[i]=temp;
							cost=cost+Math.min(arr1[i], arr2[index]);
						
							Arrays.sort(arr1);
							Arrays.sort(arr2);
							if(Arrays.equals(arr1, arr2)) {
								System.out.println(cost);
								break;
							}
						}
					}
				}
			}
		}
		sc.close();
	}

}
