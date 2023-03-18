package com.nguyen;

import java.util.Scanner;

public class main {
	
	public static boolean estPremier(int nombre) {
		boolean isPremier = true;

		if (nombre < 2)
			isPremier = false;
		else {
			for (int i = 2; i < nombre && isPremier; i++) {
				if (nombre % i == 0) {
					isPremier = false;
				}
			}
		}
		return isPremier;
	}

	public static void main(String[] args) {
		// + EXERCICE 3 +
		Scanner sc = new Scanner(System.in);
		int inputUsager;
		do {
			inputUsager = sc.nextInt();
			if (inputUsager != 0)
				System.out.println(estPremier(inputUsager));
			
		} while (inputUsager != 0);
	}

}
