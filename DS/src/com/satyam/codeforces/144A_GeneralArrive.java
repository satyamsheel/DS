package com.satyam.codeforces;

import java.util.*;
public class GeneralArrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sol=sc.nextInt();
		int arr[]=new int[sol];
		for(int i=0;i<sol;i++) {
			arr[i]=sc.nextInt();		}
		
		int max=0;
		int maxindex=0;
		int min=1000;
		int minindex=0;
		for(int i=0;i<sol;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxindex=i;
			}
			if(arr[i]<min) {
				min=arr[i];
				minindex=i;
			}
		}
		int res;
		if(maxindex>minindex) {
			res=(maxindex-1)+(sol-minindex)-1;
		}else
			res=(maxindex-1)+(sol-minindex);
		System.out.println(res);
		sc.close();
		//some prob in Testcase 2
	}

}
//cpp
//#include <iostream>
//#include<cmath>
//using namespace std;
//int main() {
//int n;
//int maxvalue=0;
//int minvalue=1000;
//int maxindex=0;
//int minindex=0;
//cin>>n;
//for(int i=0;i<n;i++){
//	int x;
//	cin>>x;
//if(x>maxvalue){
//	maxindex=i;
//	maxvalue=x;
//}
// if(x<=minvalue){
//	minindex=i;
//	minvalue=x;
// }
//}
//if(maxindex>minindex){
//	cout<<(maxindex-1)+(n-minindex)-1;
//}
//else{
//	cout<<(maxindex-1)+(n-minindex);
//
//}
//	return 0;
//}
//
//
