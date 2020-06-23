package com.satyam.practise;
import java.util.*;

public class bitwise_282A {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int q=0;
		ArrayList<String> arr=new ArrayList<String>();
		if(a>=1 && a<=150) {
			for(int i=0;i<a;i++) {
				arr.add(sc.next());
			}
			for(String i:arr) {
				if(i.equals("X++")) {	
					q++;
			}else if(i.equals("++X")) {
				++q;
			}else if(i.equals("X--")) {
				q--;
			}else if(i.equals("--X")) {
				--q;
				}
		}
	}
		System.out.println(q);

}
}
