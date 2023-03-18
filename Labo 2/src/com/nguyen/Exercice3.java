package com.nguyen;

public class Exercice3 {
	
	
	public static void main(String[] args) {
		// + DECLARATION DE CONSTANTES +
		final int MAX_TERMES = 10000;
		
		// + DECLARATION DE VARIABLES +
		
		double k;
		double produitDeWallis = 1;
		double pi;
		
		for (k = 0; k < MAX_TERMES; k++) {
			produitDeWallis *= ((2*k + 2)/(2*k+1))*((2*k + 2)/(2*k + 3));
		}
		pi = produitDeWallis * 2;
		System.out.println(pi);
	}

}
