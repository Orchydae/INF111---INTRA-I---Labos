package com.nguyen;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// + DECLARATION DES VARIABLES +
		Scanner sc = new Scanner(System.in);
		
		int inputUsager = sc.nextInt();
		int i;
		
		// Boucle qui affiche les diviseurs du nombre saisit par l'usager
		for (i = 2; i < inputUsager; i++) {
			if (inputUsager % i == 0) {
				System.out.println(i);
			}
		}
	}
}
