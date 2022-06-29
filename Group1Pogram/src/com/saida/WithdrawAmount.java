package com.saida;

import java.util.Scanner;

public class WithdrawAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("enter Amount");
int bal=5000;
int amo=scan.nextInt();
if(amo<=bal) {
	System.out.println("collect cash");

bal=bal-amo;

	}
	else {
		System.out.println("Error:low balance");
	}
System.out.println("enter balance:"+bal);
	}
}
