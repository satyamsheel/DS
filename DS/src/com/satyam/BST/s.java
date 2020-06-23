package com.satyam.BST;

class s{

	public void fun(int f){
		if(f==0)
		return;
		fun(f-1);
		System.out.println("oh yeah"+f);
	}

public static void main(String args[]){
	s ss=new s();
	ss.fun(3);
}
}
