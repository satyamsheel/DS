import java.util.*;
class Abc {
	static int nodeCount = 0;
	static class Node {
		int val;
		Node next;
		Node(int a) {
			val = a;
		}
	}
	static class LinkedList {
		Node head = null;
		Node cur = null;
		void iterate() {
			cur = head;
		}
		Node next() {
			Node val = cur;
			cur = cur.next;
			return val;
		}
		boolean hasNext() {
			if(cur != null)
				return true;
			return false;
		}
		void insert(int val) {
			//nodeCount += 1;
			if(head == null) {
				head = new Node(val);
				return;
			}
			Node cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = new Node(val);
		}
		void print() {
			Node cur = head;
			while(cur != null) {
				System.out.print(cur.val + " ");
				cur = cur.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedList ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList();
		LinkedList ll3 = new LinkedList();
		LinkedList ll4 = new LinkedList();

		int odd1 = -1, odd2 = -1, even1 = -1, even2 = -1, first = -1, last = -1;
		for(int i = 0; i < 2 * n; i ++) {
			int ins = in.nextInt();
			ll1.insert(ins);
			nodeCount += 1;
			if(i % 2 == 0) {
				if(i == 0) {
					first = ins;
					odd1 = ins;
				} else {
					odd2 = ins;
					ll2.insert(odd1 + odd2);
					nodeCount += 1;
					odd1 = odd2;
				}
			} else {
				if(i == 1) {
					even1 = ins;
				} else {
					even2 = ins;
					ll3.insert(even2 + even1);
					nodeCount += 1;
					even1 = even2;
				}
			}
			if(i == 2 * n - 1) {
				last = ins;
			}
		}
		int mid = first + last;

		ll2.iterate();
		ll1.iterate();
		while(ll2.hasNext()) {
			ll4.insert(ll1.next().val);
			ll4.insert(ll2.next().val);
			nodeCount += 2;
		}
		ll4.insert(ll1.next().val);
		ll4.insert(mid);
		nodeCount += 2;
		ll3.iterate();
		while(ll3.hasNext()) {
			ll4.insert(ll1.next().val);
			ll4.insert(ll3.next().val);
			nodeCount += 2;
		}
		ll4.insert(ll1.next().val);
		nodeCount += 1;
		ll2.print();
		ll3.print();
		System.out.println(mid);
		ll4.print();
		System.out.println(4 * n - 1);
	}
}
