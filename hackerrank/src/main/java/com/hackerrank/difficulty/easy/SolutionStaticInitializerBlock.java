package com.hackerrank.difficulty.easy;

import java.util.Scanner;

public class SolutionStaticInitializerBlock {
	
	
	static boolean flag;
	static int H;
	static int B;
	static {
	    Scanner sc = new Scanner(System.in);
	    B =sc.nextInt();
	    H =sc.nextInt();
	    flag = (B>0) && (H>0);
	    if (!flag) {
	    	System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	    
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class