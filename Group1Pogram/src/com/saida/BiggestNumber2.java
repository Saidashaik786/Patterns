package com.saida;

import java.util.Scanner;

public class BiggestNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan =new Scanner (System.in);
     System.out.println("enter three numbers");
     int a=scan.nextInt();
     int b=scan.nextInt();
     int c=scan.nextInt();
     if(a>b&&a>c) {
    	 System.out.println("a is big");
    	 
     }
     else if(b>c) {
    	 System.out.println("b is big");
     }
     else {
    	 System.out.println("c is big");
     }
	}

}
