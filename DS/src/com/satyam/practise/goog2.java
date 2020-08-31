package satyamPractise;

import java.io.IOException;
import java.util.*;

public class goog2
{
	public static void main(String[] args) throws IOException
	{
		try{
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while (t-- >= 0) {
				int chef = sc.nextInt();
				int rick = sc.nextInt();
				int c = (int) Math.ceil(chef / 9.0);
				int d = (int) Math.ceil(rick / 9.0);
				if (d <= c) {
					System.out.println("1 " + d);
				} else {
					System.out.println("0 " + c);
				}
			}
		}catch(Exception e){
			return;
		}
	}
}
