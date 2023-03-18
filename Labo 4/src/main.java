import java.util.Scanner;

public class main {

	static void triParInsertion(String tab[]) {
		int i, j;
		String temp = new String();
		for (i = 1; i < tab.length; i++) {
			temp = tab[i];
			for (j = i; j > 0 && tab[j-1].compareTo(temp) > 0; j--) {
				tab[j] = tab[j-1];
			}
			tab[j] = temp;
		}
		for (i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
	static int fouilleDichotomique(String tab[], String motRecherche) {
		boolean trouvee = false;
		int debut = 0;
		int fin = tab.length-1;
		int milieu = -1;
		while (debut <= fin && !trouvee) {
			milieu = (debut + fin)/2;
			if (tab[milieu].equals(motRecherche))
				trouvee = true;
			else if (tab[milieu].compareTo(motRecherche) > 0 )
				fin = milieu - 1;
			else
				debut = milieu + 1;
		}
		if (trouvee) {
			return milieu;
		} else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		// Exercice 1
		String[] fruits = {"Poires","Figues","Grenadines","Prunes","Mangues",
				"Raisins","Mandarines","Pommes","Melons","Kiwis","Abricots",
				"Bananes","Cerises"};
		triParInsertion(fruits);
		Scanner sc = new Scanner(System.in);
		String inputUsager;
		int positionTrouve;
		do {
			inputUsager = sc.nextLine();
			positionTrouve = fouilleDichotomique(fruits, inputUsager);
			if (positionTrouve >= 0)
				System.out.println(inputUsager + " se retrouve a la position: " + positionTrouve);
			else
				System.out.println(inputUsager + " ne se retrouve pas dans la liste.");
		} while (!inputUsager.equals("fin"));
		
	}

}
