package com.hexaware;

import java.io.*;


public class IOException{
	public static void main(String args[]) throws java.io.IOException{
		System.out.println("Main Starts...");
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader bf=new BufferedReader(isr);
			int x=0,y=0;
			System.out.println("Enter the value of the x:");
			x=Integer.parseInt(bf.readLine());
			System.out.println("Enter the value of y:");
			y=Integer.parseInt(bf.readLine());
			int z=x/y;
			System.out.println("z:"+z);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Main Ends...");
		
		
	}
	
}
	
	
	
