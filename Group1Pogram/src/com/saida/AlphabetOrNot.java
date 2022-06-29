package com.saida;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//      Scanner scan=new Scanner(System.in);
//      System.out.println("Enter a charater");
//      char ch=scan.next().charAt(0);
//      if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
//    	  System.out.println("is charater");
//    	  
//      }
//      else {
//    	  System.out.println("is not charater");
//      }
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a charater");
		char ch=scan.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("is a upper case");
		}
		
		else if   (ch>='a'&&ch<='z') {
			  System.out.println("is a lower case");
		  }
		else if (ch>='0'&&ch<='9') {
			  System.out.println("charater is digit");
		}
		  
		  else {
			  System.out.println("charater is symblo");
		  }
	}
}

