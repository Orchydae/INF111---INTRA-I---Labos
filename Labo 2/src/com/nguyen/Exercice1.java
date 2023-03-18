package com.nguyen;

public class Exercice1 {

	public static void main(String[] args) {
		// + Declaration des variables +
		int i;
		
		// Boucle qui affiche les nombres impars compris entre 0 et 200
		for (i = 0; i < 200; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
