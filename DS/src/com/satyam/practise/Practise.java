package com.satyam.codeforces.distributer;

import java.util.*;
public class Practise {

	public static void main(String[] args) {
		List<Integer> values=new ArrayList<>();
		values.add(123);
		values.add(121);
		values.add(322);
		values.add(232);
		values.add(454);
		values.add(665);
		values.add(322);
		
		Collections.sort(values,(i1,i2)->{
			if(i1<i2)
				return 1;
			return -1;
		}
		);
		values.forEach(System.out::println); 
	}

}
