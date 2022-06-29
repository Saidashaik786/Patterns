package com.saida;

import java.util.Scanner;

public class Pattern10Swastick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("enter a charater");
     char ch=scan.next().charAt(0);
     System.out.println("enter a number");
     int n=scan.nextInt();
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 if(i==(n+1)/2 || j==(n+1)/2 || (i==1 && j<=(n+1)/2)||
    				 (i==n && j>=(n+1)/2)||(j==n && i<=(n+1)/2)||(j==1 && i>=(n+1)/2)){
    			 System.out.print(ch+" ");
    		 }
    		 else {
    			 System.out.print(" ");
    		 }
    	 }
    	 System.out.println();
     }
	}

}
