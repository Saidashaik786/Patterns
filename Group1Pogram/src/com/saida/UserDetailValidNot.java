package com.saida;

import java.util.Scanner;

public class UserDetailValidNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner (System.in);
       System.out.println("enter user details");
       String name=scan.next() ;
       int pwd=scan.nextInt();
       if(name ==("sathya") && pwd == 1234) 
       {
    	    System.out.println("valid detail");
       }
       else
       {
    	   System.out.println("invalid detail");
       }
      
	}

}
