package satyamPractise;

import java.util.*;
public class quickSort {
	
	int seperate(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
	
	void sorting(int arr[],int low,int high) {
		if(low<high) {
			int piv=seperate(arr,low,high);
			
			sorting(arr,low,piv-1);
			sorting(arr,piv+1,high);
		}
		
	}
	
	

	public static void main(String[] args) {
		Random rand=new Random();
		quickSort quick=new quickSort();
		int n=rand.nextInt(20-10)+10;
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=rand.nextInt(50);
		}
		System.out.println("Initial Array"+Arrays.toString(arr));
		
		quick.sorting(arr,0,n-1);
		
		System.out.println("Sorted Array"+Arrays.toString(arr));
		
		
		

	}

}
