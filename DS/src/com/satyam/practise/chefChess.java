package satyamPractise;

import java.util.*;
public class chefChess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int arr[]=new int[1000];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			int minCount=-1;
			int count =100000;
			
			for(int i=0;i<N;i++) {
				
				if(K%arr[i]==0) {
					
					int data = K/arr[i];
					if(data<count) {
						count=data;
						minCount=arr[i];
					}
				}
			}
			System.out.print(minCount);	
		}
		sc.close();

	}

}
