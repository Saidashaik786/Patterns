package com.saida;

import java.util.Scanner;

public class Read5SubMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("enter 5 sub marks");
    int m1=scan.nextInt();
    int m2=scan.nextInt();
    int m3=scan.nextInt();
    int m4=scan.nextInt();
    int m5=scan.nextInt();
    Read5SubMark rm=new Read5SubMark();
    String res=rm.result(m1,m2,m3,m4,m5);
    System.out.println("result is:"+res);
	}
	String result(int m1,int m2,int m3,int m4,int m5) {
		if(m1>=40&&m2>=40&&m3>=40&&m4>=40&&m5>=40)
			return "pass";
		
			else {
		return "fail";
	}
	}
}

