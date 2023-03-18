package com.nguyen;

import java.util.Scanner;

public class Exercice4 {

	public static final int CIMENT_BETON = 350;
	public static final int SABLE_BETON = 680;
	public static final int GRAVIER_BETON = 1175;
	
	public static int fabricationBeton(int ciment, int sable, int gravier) {
		int validiteCiment = ciment / CIMENT_BETON;
		int validiteSable = sable / SABLE_BETON;
		int validiteGravier = gravier / GRAVIER_BETON;
		
		int tableauValidite[] = {validiteCiment, validiteSable, validiteGravier};
		int validiteMinimale = tableauValidite[0];
		
		for (int i = 1; i < tableauValidite.length; i++) {
			if (tableauValidite[i] < validiteMinimale) 
				validiteMinimale = tableauValidite[i];
		}
		
		return validiteMinimale;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ciment = sc.nextInt();
		int sable = sc.nextInt();
		int gravier = sc.nextInt();
		
		System.out.println(fabricationBeton(ciment, sable, gravier));
	}

}
