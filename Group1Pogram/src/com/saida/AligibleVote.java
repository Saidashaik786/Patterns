package com.saida;

import java.util.Scanner;

public class AligibleVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter age");
int age=scan.nextInt();
if(age>=18) {
	System.out.println("Eligibul for vote");
}
else {
	System.out.println("not Eligible for vote");
}
	}

}
