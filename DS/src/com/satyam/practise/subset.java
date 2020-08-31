package satyamPractise;

//A Java program to print all subsets of a set 
import java.io.IOException; 
class subset
{ 
	public static void main(String[] args) 
	{ 
		int arr[] = {2,7,10}; 
		int len = arr.length;
		for (int i = 0; i < (1<<len); i++) 
		{ 
			for (int j = 0; j < len; j++) 
				if ((i & (1 << j)) > 0) 
					System.out.print(arr[j] + " "); 
			System.out.println(); 
		} 
	} 
} 

