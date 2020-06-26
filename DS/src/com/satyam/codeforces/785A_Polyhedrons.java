package com.satyam.codeforces;

import java.util.*;
public class Polyhedrons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String shape;
		int side=0;
		for(int i=0;i<n;i++) {
			shape=sc.next();
			if(shape.equalsIgnoreCase("Tetrahedron")) {
				side+=4;
			}
			if(shape.equalsIgnoreCase("Cube")) {
				side+=6;
			}
			if(shape.equalsIgnoreCase("Octahedron")) {
				side+=8;
			}
			if(shape.equalsIgnoreCase("Dodecahedron")) {
				side+=12;
			}
			if(shape.equalsIgnoreCase("Icosahedron")) {
				side+=20;
			}
		}
		System.out.println(side);
		sc.close();
		

	}

}
