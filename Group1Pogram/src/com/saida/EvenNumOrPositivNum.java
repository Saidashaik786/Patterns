package com.saida;

import java.util.Scanner;

public class EvenNumOrPositivNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan =new Scanner(System.in);
   System.out.println("enter a number");
   int n=scan.nextInt();
   if(n>0) {
	   System.out.println("its positive");
   }
   if(n%2==0) {
	   System.out.println("its even number");
   }
   else {
	   System.out.println("is not a even number");
   }
  
	}

}
