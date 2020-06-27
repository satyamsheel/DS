package com.satyam.Stack;

import java.util.*;

public class HackerEarth_BalanceBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ss = new String[n];
		for (int i = 0; i < n; i++) {
			ss[i] = sc.next();
		}
		int p = 0;

		while (p < n) {
			String s = ss[p];
			String result = "";
			++p;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == '{' || ch == '[' || ch == '(') {
					stack.push(ch);
				} else if (ch == '}' || ch == ']' || ch == ')' && !stack.isEmpty()) {
					if (stack.peek() == '{' && ch == '}' || stack.peek() == '[' && ch == ']'
							|| stack.peek() == '(' && ch == ')') {
						stack.pop();
					} else {
						result = "NO";
						break;
					}
				} else {
					if (ch == '}' || ch == ']' || ch == ')') {
						result = "NO";
						break;
					}
				}
			}
			if (!result.isEmpty()) {
				System.out.println(result);
			} else {
				if (stack.isEmpty()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}

		sc.close();

	}

}
