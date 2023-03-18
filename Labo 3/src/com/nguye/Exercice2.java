package com.nguye;

import java.util.Arrays;

public class Exercice2 {
	/* C'est quoi la difference entre getInverse() VS inverser()
	 * C'est quoi une fusion triee de 2 tableaux
	 */
	static double getNbAleatoireEntre(double min, double max) {
		return Math.random() * (max-min) + min;
	}
	
	static void remplirAleatoirement(double[] array, double min, double max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = getNbAleatoireEntre(min, max);
			System.out.print(array[i] + ",");
		}
	}
	
	static int[] getNouveauTableau(int nb, double min, double max) {
		int[] tableau = new int[nb];
		for (int i = 0; i < nb; i++) {
			tableau[i] = (int) getNbAleatoireEntre(min, max);
		}
		return tableau;
	}
	
	static int getNombreDeZeros(int[][] array) {
		int compteurZero = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j= 0; j < array[0].length; j++) {
				if (array[i][j] == 0) {
					compteurZero++;
				}
			}
		}
		return compteurZero;
	}
	
	static int[][] multiplie(int[][] array1, int[][] array2) {
		int[][] tableauProduit = new int[array1.length][array1[0].length];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[0].length; j++) {
				tableauProduit[i][j] = array1[i][j] * array2[i][j];
				System.out.println(tableauProduit[i][j]);
			}
		}
		return tableauProduit;
	}
	
	static int[] getInverse(int[] array) {
		int[] tableauInverse = new int[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			tableauInverse[j] = array[i];
		}
		
		return tableauInverse;
	}
	
	static void inverser(int[] array) {
		int[] temp = Arrays.copyOf(array, array.length);
		
		for (int i = temp.length - 1, j = 0; i >= 0; i--, j++) {
			array[j] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("random number: " + getNbAleatoireEntre(1, 10));
		double[] tab1 = new double[10];
		remplirAleatoirement(tab1, 15, 20);
		int[] tab2 = getNouveauTableau(5, 1, 5);
		
		for (int i = 0; i < tab2.length; i++) {
			System.out.println(tab2[i]);
		}
		
		int[][] tab3 = {{0,0},{2,3},{0,2}};
		System.out.println("Il y a " + getNombreDeZeros(tab3) + " zero.");
		
		int[][] tab4 = {{0,1,2},{3,4,5},{6,7,8}};
		int[][] tab5 = {{0,1,2},{3,4,5},{6,7,8}};
		
		multiplie(tab4, tab5);
		
		int[] tab6 = {0,1,2,3,4,5};
		System.out.println("getInverse() TEST:");
		int[] tab7 = getInverse(tab6);
		
		for (int j = 0; j < tab7.length; j++) {
			System.out.println(tab7[j]);
		}
		
		int[] tab8 = {11,22,33,44,55,66};
		inverser(tab8);
		for (int k = 0; k < tab8.length; k++) {
			System.out.println(tab8[k]);
		}
		
		
	}

}
