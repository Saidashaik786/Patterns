package com.saida;

import java.util.Scanner;

public class Swapin {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a number ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("befofe swap:" + a + "," + b);
//		int c = a;
//		a = b;
//		b=c;
//        System.out.println("after saping"+a+","+b);
//	}
//
//}

//	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("before swap:"+a+","+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("after swaping"+a+","+b);
		
	}
}