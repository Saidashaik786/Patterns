package com.saida;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
for (int i=1;i<=7;i++) {
	for(int j=1;j<=7;j++) {
		if(i==1||j==7-3||i==7) {
			System.out.print("+");
		}
		else {
			System.out.print(" ");
		}
		
	}
	System.out.println();
}
	}

}
