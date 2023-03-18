package com.nguyen;

import java.util.Scanner;

public class Exercice4 {
	
	public void DeterminePremier(int nombre) {
		int isNotPrime = 0;
		int i;
		
		// Boucle qui determine si le chiffre saisit par l'usager est premier ou non
		for (i = 2; i < nombre && isNotPrime == 0; i++) {
			if (nombre % i == 0) {
				isNotPrime++;
			}
		}
		
		// + AFFICHAGE DU RESULTAT +
		if (isNotPrime == 1)
			System.out.printf("Le nombre %d n'est pas premier\n", nombre);
		else
			System.out.printf("Le nombre %d est premier\n", nombre);
	}

	public static void main(String[] args) {
		// + DECLARATION DES VARIABLES +
		Scanner sc = new Scanner(System.in);
		
		int inputUsager = sc.nextInt();
		
		DeterminePremier(inputUsager);
	}

}
