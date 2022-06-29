package com.saida;

import java.util.Scanner;

public class BillDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("entar a number");
double bill=scan.nextDouble();
if(bill>5000) {
	double dis=0.15*bill;
	bill=bill-dis;
	
}
System.out.println("final dill:"+bill);
	}

}
