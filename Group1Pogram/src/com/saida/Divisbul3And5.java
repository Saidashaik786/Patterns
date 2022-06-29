package com.saida;

import java.util.Scanner;

public class Divisbul3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter div numbers");
int n=scan.nextInt();
if(n%3==0&&n%5==0) {
	System.out.println(" numbre is div: "+n);
}
else {
	System.out.println("number is not div:"+n);
}
	}

}
