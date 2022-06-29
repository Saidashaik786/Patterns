package com.saida;

import java.util.Scanner;

public class EvenNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   int n= s.nextInt();
   if(n%2==0) {
	   System.out.println(n+"is even numer");
   }
   else
	   System.out.println("not even Number");
   
	}

}
