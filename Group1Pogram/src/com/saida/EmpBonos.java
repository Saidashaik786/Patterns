package com.saida;

import java.util.Scanner;
public class EmpBonos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter emp salary");
		double sal = scan.nextDouble();
		int exp = scan.nextInt();
		if (exp < 5) {
			double bonos = (0.20 * sal);
			sal = bonos + sal;
				System.out.println("emp total sal:" + sal);
	}
		else {
			System.out.println("emp expirenec no in range:"+sal);
			}
		}

}
