package com.saida;

public class matrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][][] a2 = new int[2][3][3][4];
		 // print array in rectangular form
		   for (int i=0; i<a2.length; i++) {
		     for (int j=0; j<a2[i].length; j++) {
		         for (int x=0; x<3; x++){
		             for (int y=0; y<3; y++){
		                System.out.print(" " + a2[i][j][x][y]);
		             }
		         }
		     }
		     System.out.println("");
		   }
		 }

	}


