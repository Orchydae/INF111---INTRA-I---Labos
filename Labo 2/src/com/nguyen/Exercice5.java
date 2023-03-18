package com.nguyen;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// + DECLARATION DES VARIABLES +
		Exercice4 exercice4 = new Exercice4();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Veuillez entrer votre premiere valeur: ");
		int inputUsager = sc.nextInt();
		
		while (inputUsager > 0) {
			exercice4.DeterminePremier(inputUsager);
			System.out.println("Veuillez entrer la prochaine valeur (0 pour sortir): ");
			inputUsager = sc.nextInt();
		}
		
		
	}

}
