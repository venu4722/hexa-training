package com.hexaware.java8;

public class Main {
	public static void main(String[] args) {
		FuncInterface res=(a,b)->{
			System.out.println(a+b);
		};
		res.add(10, 20);
	}
}
