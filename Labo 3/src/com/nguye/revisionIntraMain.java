package com.nguye;

import java.util.Scanner;

public class revisionIntraMain {

	static double getNbAleatoireEntre(double min, double max) {
		return Math.random() * (max-min) + min;
	}
	
	static void remplirAleatoirement(double[] array, double min, double max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = getNbAleatoireEntre(min, max);
		}
	}
	
	static double[] getNouveauTableau(int nombreEntier, double min, double max) {
		double[] tableau = new double[nombreEntier];
		remplirAleatoirement(tableau, min, max);
		return tableau;
		
	}
	
	static double[] getInverse(double[] array) {
		double[] tableau = new double[array.length];
		for (int i = tableau.length-1, j = 0; i >= 0; i--, j++) {
			tableau[j] = array[i];
		}
		return tableau;
	}
	
	static double[] fusion(double[] tab1, double[] tab2) {
		double[] tabFusion = new double[tab1.length + tab2.length];
		int i, j, k, m, n;
		double temp;
		
		for (i = 0; i < tab1.length; i++) {
			tabFusion[i] = tab1[i];
		}
		for (j = tab1.length, k = 0; j < tabFusion.length; j++, k++) {
			tabFusion[j] = tab2[k];
		}
		
		for (m = 1; m < tabFusion.length; m++) {
			temp = tabFusion[m];
			for (n = m; n > 0 && tabFusion[n - 1] > temp; n--) {
				tabFusion[n] = tabFusion[n-1];
			}
			tabFusion[n] = temp;
		}
			
		return tabFusion;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getNouveauTableau
		System.out.println("=== getNouveauTableau ===");
		double[] tableauGetNouveau = getNouveauTableau(1, 0, 30);
		for (int i = 0; i < tableauGetNouveau.length; i++) {
			System.out.printf("%.0f ", tableauGetNouveau[i]);
		}
		
		// getInverse
		System.out.println("\n=== getInverse ===");
		double[] reverseTableauGetNouveau = getInverse(tableauGetNouveau);
		for (int j = 0; j < reverseTableauGetNouveau.length; j++)
			System.out.printf("%.0f ", reverseTableauGetNouveau[j]);
		
		// fusion
		System.out.println("\n=== fusion ===");
		double[] tab2 = getNouveauTableau(6, 0, 50);
		System.out.println("tab2");
		for (int k = 0; k < tab2.length; k++) {
			System.out.printf("%.0f ", tab2[k]);
		}
		
		System.out.println("\n");
		
		double[] tabFusionne = fusion(tableauGetNouveau, tab2);
		for (int m = 0 ; m < tabFusionne.length; m++) {
//			System.out.printf("%.0f ", tabFusionne[m]);
		}
		
		int[] conversionTabInt = new int[tabFusionne.length];
		for (int n = 0; n < conversionTabInt.length; n++) {
			conversionTabInt[n] = (int) Math.round(tabFusionne[n]);
			System.out.printf("%d ", conversionTabInt[n]);
		}
		
		Scanner sc = new Scanner(System.in);
		int valeurCherchee = sc.nextInt();
		sc.close();
		boolean trouvee = false;
		int debut = 0;
		int fin = conversionTabInt.length-1;
		int milieu = -1;
		
		while (debut <= fin && !trouvee) {
			milieu = (debut+fin)/2;
			if (valeurCherchee == conversionTabInt[milieu])
				trouvee = true;
			else if (valeurCherchee > conversionTabInt[milieu])
				debut = milieu + 1;
			else
				fin = milieu - 1;
			
		}
		System.out.println("last" + conversionTabInt[conversionTabInt.length-1]);
		System.out.println(trouvee);
		
		
	}

}
