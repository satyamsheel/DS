package satyamPractise;

import java.util.*;
class ProblemB {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		HashMap<Integer, Integer> path = new HashMap<>();
		int num = n;
		int count = 1;
		path.put(n, 0);
		while(num > 1) {
			int i;
			int flag = 0;
			for(i = 2; i <= (int)Math.sqrt(num); i++) {
				if(num % i == 0) {
					//System.out.println(num + " is divisible by " + (num / i));
					path.put(num / i, count++);
					num = num / i;
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				path.put(1, count);
				break;
			}
		}
		if(!path.containsKey(num))
			path.put(num, count);
		//System.out.println(path.toString());
		count = 1;
		//HashMap<Integer, Integer> path2 = new HashMap<>();
		num = m;
		if(path.containsKey(m)) {
			System.out.print(path.get(m));
			return;
		}
		while(num > 1) {
			int i;
			int flag = 0;
			for(i = 2; i <= (int) Math.sqrt(num); i++) {
				if(num % i == 0) {
					//System.out.println("Found " + (num / i));
					if(path.containsKey(num / i)) {
						System.out.print(count + path.get(num / i));
						return;
					}
					flag = 1;
					num /= i;
					count++;
					break;
				}
			}
			if(flag == 0) {
				num = 1;
			}
			if(num == 1) {
				//System.out.println("Here");
				System.out.print(count + path.get(1));
				return;
			}
		}
		//path.pu
	}
	public static void DFS() {

	}
}
