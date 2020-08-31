package satyamPractise;

import java.util.*;

public class codevita1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		String ss = sc.next();

		long i, numA = 0, numB = 0, c = 0;
		char l = 0, r;

		char s[] = ss.toCharArray();

		for (i = 0; i < n; i++) {
			if (s[(int) i] == 'A') {
				numA++;
			} else if (s[(int) i] == 'B') {
				numB++;
			}
		}
		i = 0;

		while (i < n && s[(int) i] == '-') {
			c++;
			i++;
		}

		if (s[0] == '-' && i < n && s[(int) i] == 'A') {
			numA += c;
		}

		if (i == n - 1 && s[(int) i] == 'A') {
			numA++;
		}

		c = 0;

		while (i < n - 1) {
			if ((s[(int) i] == 'A' || s[(int) i] == 'B') && s[(int) (i + 1)] == '-') {
				l = s[(int) i];
				c = 1;
			} else if (s[(int) i] == '-' && (s[(int) (i + 1)] == 'A' || s[(int) (i + 1)] == 'B')) {
				r = s[(int) (i + 1)];
				if (l == 'A' && r == 'A') {
					numA = numA +c;
				} else if (l == 'B' && r == 'B') {
					numB = numB +c;
				} else if (l == 'B' && r == 'A') {
					numA =numA + c / 2;
					numB =numB + c / 2;
				}
				c = 0;
			} else if (s[(int) i] == '-' && s[(int) (i + 1)] == '-') {
				c++;
			}
			i++;
		}
		if (c > 0) {
			if (l == 'B')
				numB = numB +c;
			c = 0;
		}

		if (numA > numB) {
			System.out.print("A");
		} else if (numB > numA) {
			System.out.print("B");
		} else {
			System.out.print("Coalition government");
		}

	}

}
