package com.hexaware;

public class MemoryLocation {
	public int a;
	public static int b;
	public static void m() {
		System.out.println("Static Method...");
//		System.out.println("The value of a:"+a);
		System.out.println("The value of b:"+b);
	}
	public void m1() {
		System.out.println("Instance Method");
		System.out.println("The value of a:"+a);
		System.out.println("The value of b:"+b);
	}
}
