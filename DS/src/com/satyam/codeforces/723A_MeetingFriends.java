package com.satyam.codeforces.distributer;

import java.util.*;
public class MeetingFriends {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int arr[]=new int[3];
		 
		 arr[0]=sc.nextInt();
		 arr[1]=sc.nextInt();
		 arr[2]=sc.nextInt();
		 
		 Arrays.sort(arr);
		 int dist=0;
		 
		 dist=dist+(arr[1]-arr[0]);
		 dist=dist+(arr[2]-arr[1]);
		 
		 System.out.println(dist);
		 
		sc.close();

	}

}
