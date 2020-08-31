package satyamPractise;

import java.util.*;
public class subseq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int arr[]=new int[n];
			arr[0]=1;
			int j=1;
			while(j<n) {
				arr[j]=(arr[j-1]*2)%1000000007;
				j++;
			}
			for(int k=n-1;k>=0;k--) {
				System.out.print(arr[k]+" ");
			}
		}

	}

}
