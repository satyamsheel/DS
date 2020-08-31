package satyamPractise;
import java.util.*;
public class highlow {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();
			int ar[] = new int[n];
			int br[] = new int[m];
			for(int i = 0; i < n; i++) {
				ar[i] = in.nextInt();
			}
			for(int i = 0; i < m; i++) {
				br[i] = in.nextInt();
			}
			HashSet<Integer> set = new HashSet<>();
			for(int i = 0; i < n; i++) {
				HashSet<Integer> set1 = new HashSet<>();
				for(int j = 0; j < m; j++) {
					int res = ar[i] & br[j];
					if(i == 0) {
						set.add(res);
					} else {
						for(Integer a : set) {
							set1.add(a | res);
						}
					}
				}
				if(i != 0)
					set = set1;
				//System.out.println(set.toString());
			}
			int min = Integer.MAX_VALUE;
			for(Integer a : set) {
				min = Math.min(a, min);
			}
			System.out.println(min);
		}
	}

