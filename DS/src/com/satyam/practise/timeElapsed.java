package satyamPractise;

import java.util.*;
public class timeElapsed {

	public static void main(String[] args) {
		Random rand=new Random();
		
		System.out.println("Initial Matrix");
		int row=rand.nextInt(20);
		int col=rand.nextInt(20);
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		int arr3[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=rand.nextInt(100);
				arr2[i][j]=rand.nextInt(100);
			}
		}
		System.out.println("Array 1");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array 2");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Addition");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		System.out.println("Subtraction");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr3[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
	}

}
